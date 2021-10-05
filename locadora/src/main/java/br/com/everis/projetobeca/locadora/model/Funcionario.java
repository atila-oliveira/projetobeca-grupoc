package br.com.everis.projetobeca.locadora.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String Nome;

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

    /*
    private boolean cadastrarCliente;
    private boolean alterarCliente;
    private boolean excluirCliente;
    private String cadastrarPedido;
    private boolean atualizarPedido;
    private boolean pagarPedido;
    private boolean darBaixaPedido;
    private boolean cadastrarProduto;
    private boolean alterarProduto;
    private boolean excluirProduto;
*/
}