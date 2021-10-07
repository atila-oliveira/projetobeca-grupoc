package br.com.everis.projetobeca.locadora.service;

import br.com.everis.projetobeca.locadora.controller.dto.ProdutoDTO;
import br.com.everis.projetobeca.locadora.model.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> findAll();
    Produto findById(Long id);
    Produto save(Produto produto);

}
