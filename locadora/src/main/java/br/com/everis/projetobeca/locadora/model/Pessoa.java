package br.com.everis.projetobeca.locadora.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PESSOAS")
@Getter
@Setter
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private String endereco;
    private String email;
    private String cpf;



//    public Pessoa() {
//        this.nome = "null";
//        this.endereco = "null";
//        this.email = "null";
//        this.cpf = "null";
//    }


}
