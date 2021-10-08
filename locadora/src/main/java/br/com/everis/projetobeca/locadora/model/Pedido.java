package br.com.everis.projetobeca.locadora.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "PEDIDOS")
@Data
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Cliente cliente;

    @Column(nullable = false, unique = false)
    private StatusPedido status;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @ManyToMany
    @JoinColumn(referencedColumnName = "idProduto", name = "idPedido")
    private List<Produto> produtos;

    private  FormaPagamento formaPagamento;

    private Double valorTotal;

    private Double totalPago;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;
}
