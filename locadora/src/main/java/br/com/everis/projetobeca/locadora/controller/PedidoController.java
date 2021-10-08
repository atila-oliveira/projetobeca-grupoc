package br.com.everis.projetobeca.locadora.controller;

import br.com.everis.projetobeca.locadora.model.Cliente;
import br.com.everis.projetobeca.locadora.model.Pedido;
import br.com.everis.projetobeca.locadora.model.Produto;
import br.com.everis.projetobeca.locadora.service.PedidoService;
import br.com.everis.projetobeca.locadora.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService  pedidoService;

    @Autowired
    private ProdutoService produtoService;

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

    @RequestMapping(value = "/novopedido", method = RequestMethod.POST)
    public String savePedido(@Valid Pedido pedido, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors() ) {
            attributes.addFlashAttribute("messagem", "Verifique de os campos obrigatórios foram preenchidos");
            return "redirect:/novopedido";
        }

        pedidoService.save(pedido);

        return "redirect:/{" + pedido.getId() + "}/novoproduto";
    }

    @RequestMapping(value = "/{idPedido}/novoproduto", method = RequestMethod.GET)
    public ModelAndView adicionarProdutoAoPedido(@PathVariable("idPedido") Long idPedido){
        ModelAndView mv = new ModelAndView("adicionarProdutoAoPedido");

        List<Produto> listaProdutos = produtoService.findAll();
        Pedido pedido = pedidoService.findById(idPedido);

        mv.addObject("produtos", listaProdutos);
        mv.addObject("pedido", pedido);

        return mv;
    }

    @RequestMapping(value = "/pedido/novoproduto", method = RequestMethod.PATCH)
    public void adicionarProdutoPedido(Pedido pedido, Produto produto, BindingResult result){
        pedido.getProdutos().add(produto);

        pedidoService.save(pedido);

        return "redirect:/{" + pedido.getId() + "}/novoproduto";
    }

}
