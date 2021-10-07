package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.model.Funcionario;
import br.com.everis.projetobeca.locadora.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @RequestMapping(value = "/funcionarios", method = RequestMethod.GET)
    public ModelAndView buscarFuncionario(){
        ModelAndView mv = new ModelAndView("funcionarios");
        List<Funcionario> funcionarios = funcionarioService.findAll();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }
}
