package br.com.everis.projetobeca.locadora.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PRODUTOS")
@Data
public class Produto {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @OneToOne
   private Pedido pedido;

   @Column(nullable = false, unique = false)
   private String nome;

   @Column(nullable = false, unique = false)
   private String descricao;

   @Column(nullable = false, unique = false)
   private Double preco;

   public Produto(){}
   public Produto(String nome, Double preco, String descricao){
      this.nome = nome;
      this.preco = preco;
      this.descricao = descricao;
   }

}
