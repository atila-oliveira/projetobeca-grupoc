package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.model.Produto;
import br.com.everis.projetobeca.locadora.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class ControllerProduto {
    @Autowired
    ProdutoService produtoService;

    @RequestMapping(value = "/Produto", method = RequestMethod.GET)
    public ModelAndView buscarProdutos(){
        ModelAndView mv = new ModelAndView("Produtos");
        List<Produto> produtos = produtoService.findAll();
        mv.addObject("Produtos", produtos);
        return mv;
    }

}
