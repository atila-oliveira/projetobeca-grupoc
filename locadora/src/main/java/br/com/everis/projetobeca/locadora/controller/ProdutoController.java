package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.dto.requests.ProdutoRequest;
import br.com.everis.projetobeca.locadora.dto.responses.ProdutosResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
public class ProdutoController {

    @PostMapping
    public ProdutosResponse cadastrar(@RequestBody ProdutoRequest funcionarioRequest){
    return null;

    }
}
