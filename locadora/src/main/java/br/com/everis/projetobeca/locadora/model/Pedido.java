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
//  private StatusPedido status;
//  private Funcionario funcionario;
//  private List<Produto> listaProdutos;
    private Double valorTotal;
    private Double TotalPago;
//  private Pagamento pagamento;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;


}
