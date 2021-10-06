package br.com.everis.projetobeca.locadora.service.implem;

import br.com.everis.projetobeca.locadora.model.Pedido;
import br.com.everis.projetobeca.locadora.repository.PedidoRepository;
import br.com.everis.projetobeca.locadora.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoServiceImplemen implements PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido findById(Long id) {
        return pedidoRepository.findById(id).get();
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
