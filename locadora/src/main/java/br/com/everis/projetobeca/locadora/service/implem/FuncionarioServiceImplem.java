package br.com.everis.projetobeca.locadora.service.implem;

import br.com.everis.projetobeca.locadora.model.Funcionario;
import br.com.everis.projetobeca.locadora.repository.FuncionarioRepository;
import br.com.everis.projetobeca.locadora.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FuncionarioServiceImplem implements FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> findAll() {
        return null;
    }

    @Override
    public Funcionario findById(Long id) {
        return null;
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        return null;
    }
}
