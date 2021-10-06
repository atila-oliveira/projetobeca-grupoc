package br.com.everis.projetobeca.locadora.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String telefone;

    @NotBlank
    private String cpf;

    @NotBlank
    private String email;

    @NotBlank
    private String endereco;

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}


