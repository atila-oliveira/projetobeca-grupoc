package br.com.everis.projetobeca.locadora.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Pedido> listaPedidos;

    @NotBlank
    private String Nome;

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

}