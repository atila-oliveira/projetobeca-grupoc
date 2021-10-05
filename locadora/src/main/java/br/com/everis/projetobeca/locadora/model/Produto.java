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

   @NotBlank
   private String nome;

   @NotBlank
   private String descrição;

   @NotBlank
   private Double preco;

}
