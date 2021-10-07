package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.controller.dto.ProdutoDTO;
import br.com.everis.projetobeca.locadora.model.Produto;
import br.com.everis.projetobeca.locadora.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @RequestMapping(value = "locadora/produtos", method = RequestMethod.GET)
    public ModelAndView buscarProdutos(){
        ModelAndView mv = new ModelAndView("produtos");
        List<Produto> produtos = produtoService.findAll();
        mv.addObject("produtos", produtos);
        return mv;
    }

    //@RequestMapping(value = "/locadora/produtos", method = RequestMethod.GET)
    public String getProdutoform(){
        return "/locadora/produtos/cadastrar";
    }

    @RequestMapping(value = "/locadora/produtos/cadastrar", method = RequestMethod.POST)
    public  String cadastarProduto(@Valid Produto produto, BindingResult result, RedirectAttributes atributos){
        if(result.hasErrors()){
            atributos.addFlashAttribute("mensagem","Favor preencher todos os dados!");
            return "redirect:locadora/produtos/cadastrar";
        }
        produtoService.save(produto);
        return "redirect:/locadora";
    }

}
