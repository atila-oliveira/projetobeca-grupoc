package br.com.everis.projetobeca.locadora.model;

import lombok.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CLIENTES")
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @NotBlank //melhor no DTO - ja joga o erro 400
    @Column(nullable = false, unique = true)
    private String nome;

//    @NotBlank
    private String telefone;

//    @NotBlank
    private String cpf;

//    @NotBlank
    private String email;

//    @NotBlank
    private String endereco;

//    @NotBlank
    private String login;

//    @NotBlank
    private String senha;

    @OneToOne(cascade = CascadeType.ALL) //cria um vinculo na exclusão
    private Pedido pedido;
}


