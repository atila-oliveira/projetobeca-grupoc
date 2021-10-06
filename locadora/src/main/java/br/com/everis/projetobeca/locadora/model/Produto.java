package br.com.everis.projetobeca.locadora.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PRODUTOS")
@Getter
@Setter
public class Produto {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @OneToOne
   private Pedido pedido;
   @NotBlank
   private String nome;

   @NotBlank
   private String descricao;

   @NotBlank
   private Double preco;

   public Produto(){}
   public Produto(String nome, Double preco, String descricao){
      this.nome = nome;
      this.preco = preco;
      this.descricao = descricao;
   }

}
