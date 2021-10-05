package br.com.everis.projetobeca.locadora.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "PEDIDOS")
@Getter
@Setter
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private StatusPedido status;

   @OneToOne
   @JoinColumn(name = "funcionario_id")
   private Funcionario funcionario;

    @ManyToOne
    private List<Produto> listaProdutos;

    private Double valorTotal;
    private Double TotalPago;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;


}
