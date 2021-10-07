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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank //melhor no DTO - ja joga o erro 400
    @Column(nullable = false, unique = false)
    private String nome;

    @Column(nullable = true, unique = false)
    private String telefone;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = false)
    private String endereco;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false, unique = true)
    private String senha;

    @OneToOne(cascade = CascadeType.ALL) //cria um vinculo na exclusão
    private Pedido pedido;
}


