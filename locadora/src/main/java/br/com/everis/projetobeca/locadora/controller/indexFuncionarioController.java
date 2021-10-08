package br.com.everis.projetobeca.locadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexFuncionarioController {

    @RequestMapping(value = "/indexfuncionario", method = RequestMethod.GET)
    public ModelAndView paginaPrincipal(){
        ModelAndView mv = new ModelAndView("indexfuncionario");
        mv.addObject("indexfuncionario");
        return mv;
    }
}


