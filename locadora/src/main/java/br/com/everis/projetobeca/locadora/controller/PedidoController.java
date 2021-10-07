package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.model.Cliente;
import br.com.everis.projetobeca.locadora.model.Pedido;
import br.com.everis.projetobeca.locadora.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    PedidoService  pedidoService;

    @RequestMapping(value = "locadora/pedidos", method = RequestMethod.GET)
    public ModelAndView buscarPedido(){
        ModelAndView mv = new ModelAndView("pedidos");
        List<Pedido> pedidos = pedidoService.findAll();
        mv.addObject("pedidos", pedidos);
        return mv;
    }

}
