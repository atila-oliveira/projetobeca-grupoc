package br.com.everis.projetobeca.locadora.utils;

import br.com.everis.projetobeca.locadora.model.Cliente;
import br.com.everis.projetobeca.locadora.model.Funcionario;
import br.com.everis.projetobeca.locadora.repository.ClienteRepository;
import br.com.everis.projetobeca.locadora.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class TesteComBanco {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    ClienteRepository clienteRepository;

    //@PostConstruct //tudo o que for inserido dentro do método irá ser executado conforme a aplicação vai subindo
    public void saveDados(){

        List<Funcionario> funcionarioList = new ArrayList<>();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Juca");
        funcionario.setLogin("jucaBoladão");
        funcionario.setSenha("juca123");

        funcionarioList.add(funcionario);

        for (Funcionario func : funcionarioList) {
            Funcionario funcSaved = funcionarioRepository.save(func);
            System.out.println(funcSaved.getId());
        }


      List<Cliente> clienteList = new ArrayList<>();

      Cliente cliente = new Cliente();
      cliente.setNome("Teste");
      cliente.setCpf("11111111111");
      cliente.setLogin("teste");
      cliente.setSenha("123");
      cliente.setEmail("teste@teste");
      cliente.setEndereco("Rua de lugar nenhum");
      cliente.setPedido(cliente.getPedido());

      clienteList.add(cliente);

      for (Cliente client : clienteList) {
          Cliente clientSaved = clienteRepository.save(client);
          System.out.println(clientSaved.getId());
      }

  }
}
