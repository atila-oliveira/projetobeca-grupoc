package br.com.everis.projetobeca.locadora.service.implem;

import br.com.everis.projetobeca.locadora.model.Cliente;
import br.com.everis.projetobeca.locadora.repository.ClienteRepository;
import br.com.everis.projetobeca.locadora.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImplem implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
