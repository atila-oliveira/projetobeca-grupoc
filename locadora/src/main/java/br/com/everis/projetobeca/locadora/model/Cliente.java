package br.com.everis.projetobeca.locadora.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
public class Cliente extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String senha;
}
