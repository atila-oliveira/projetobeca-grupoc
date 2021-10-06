package br.com.everis.projetobeca.locadora.service;

import br.com.everis.projetobeca.locadora.model.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> findAll();
    Pedido findById(Long id);
    Pedido save(Pedido pedido);
}
