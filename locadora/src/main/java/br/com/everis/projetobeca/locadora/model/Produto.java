package br.com.everis.projetobeca.locadora.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity
@Table(name = "PRODUTOS")
@Getter
@Setter
public class Produto {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nome;
   private String descrição;
   private Double valor;




}
