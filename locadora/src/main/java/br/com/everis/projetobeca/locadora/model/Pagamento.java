package br.com.everis.projetobeca.locadora.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.converter.json.GsonBuilderUtils;
import java.lang.*;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@Table(name = "Pagamento")
public class Pagamento {
    private FormaPagamento formaPagamento;
    private double valorPago;

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String toString(){
        return "O valor pago foi de " + valorPago + "A forma de Pagamento escolhida foi " + formaPagamento;

    }
}
