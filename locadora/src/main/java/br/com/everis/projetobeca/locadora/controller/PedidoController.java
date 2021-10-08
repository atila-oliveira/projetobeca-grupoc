package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.model.Cliente;
import br.com.everis.projetobeca.locadora.model.Pedido;
import br.com.everis.projetobeca.locadora.model.Produto;
import br.com.everis.projetobeca.locadora.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    PedidoService  pedidoService;

    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public ModelAndView buscarPedido(){
        ModelAndView mv = new ModelAndView("pedidos");
        List<Pedido> pedidos = pedidoService.findAll();
        mv.addObject("pedidos", pedidos);
        return mv;
    }

    @RequestMapping(value = "/novopedido", method = RequestMethod.GET)
    public String getPedidoForm(){
        return "pedidoForm";
    }

    @RequestMapping(value = "/novopedidos", method = RequestMethod.POST)
    public String savePedido(@Valid Pedido pedido, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors() ) {
            attributes.addFlashAttribute("messagem", "Verifique de os campos obrigatórios foram preenchidos");
            return "redirect:/novopedido";
        }

        pedidoService.save(pedido);
        return "redirect:/pedidos";
    }

}
