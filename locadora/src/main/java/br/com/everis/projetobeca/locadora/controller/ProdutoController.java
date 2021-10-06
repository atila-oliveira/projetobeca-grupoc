package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.dto.requests.ProdutoRequest;
import br.com.everis.projetobeca.locadora.model.Produto;
import br.com.everis.projetobeca.locadora.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RestController
@RequestMapping("/produtos/cadastrar")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public String cadastrar(@RequestBody @Valid ProdutoRequest produtoRequest, BindingResult result, RedirectAttributes atribute){
        if (result.hasErrors()){
            atribute.addFlashAttribute("mensagem","Verifique se os campos foram preenchidos");
            return "redirect:/produtos/cadastrar";
        }

        produtoService.save(new Produto());
        return  "redirect:/produtos";

    }
}
