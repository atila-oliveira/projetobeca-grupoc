package br.com.everis.projetobeca.locadora.service.implem;

import br.com.everis.projetobeca.locadora.model.Produto;
import br.com.everis.projetobeca.locadora.repository.ProdutoRepository;
import br.com.everis.projetobeca.locadora.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProdutoServiceImplemen implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {
        return null;
    }

    @Override
    public Produto findById(Long id) {
        return null;
    }

    @Override
    public Produto save(Produto produto) {
        return null;
    }
}
