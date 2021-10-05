package br.com.everis.projetobeca.locadora.repository;

import br.com.everis.projetobeca.locadora.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
