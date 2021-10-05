package br.com.everis.projetobeca.locadora.repository;

import br.com.everis.projetobeca.locadora.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocadoraRepository extends JpaRepository<Pedido, Long> {
    
}
