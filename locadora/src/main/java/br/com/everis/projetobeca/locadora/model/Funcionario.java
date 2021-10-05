package br.com.everis.projetobeca.locadora.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends Pessoa {


    private String usuario;
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