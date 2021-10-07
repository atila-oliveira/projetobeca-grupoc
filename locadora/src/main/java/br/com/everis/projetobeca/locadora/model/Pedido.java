package br.com.everis.projetobeca.locadora.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "PEDIDOS")
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numero;

    @OneToOne
    private Cliente cliente;

//    @Column(nullable = false, unique = false)
    private StatusPedido status;

   @ManyToOne
   @JoinColumn(name = "funcionario_id")
   private Funcionario funcionario;

   private  FormaPagamento formaPagamento;

    @OneToOne
    private Produto produto;

//    @Column(nullable = false, unique = false)
    private Double valorTotal;

//    @Column(nullable = false, unique = false)
    private Double totalPago;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;

}
