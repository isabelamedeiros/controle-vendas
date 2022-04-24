package com.api.controlevendas.controllers;

import com.api.controlevendas.services.ControleVendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class ControleVendasController {

    @Autowired
    ControleVendasService controleVendasService;

    @GetMapping("urlclientes")
    public void consultaUrlClientes() {
        controleVendasService.consultarBaseClientes();
    }

    @GetMapping("urlcompras")
    public void consultaUrlCompras() {
        controleVendasService.consultarBaseCompras();
    }

    @GetMapping("clientes-ordenados")
    public void consultaClientesOrdenados() {
        controleVendasService.consultarClientesOrdenados();
    }

    @GetMapping("valor-total-ordenado")
    public void consultarValorTotalOrdenado() {
        controleVendasService.consultarValorTotalOrdenado();
    }

    @GetMapping("compras")
    public void consultaOrdenadaCompras() {
        controleVendasService.consultaOrdenadaCompras();
    }

    /*
     *
     *
     *
     */

    //TODO Falta implementar os metodos abaixo

    //    GET: /maior-compra/ano - (Exemplo: /maior_compra/2016) - Retornar a maior compra do ano informado com dados da compra
    @GetMapping("maior-compra/ano")
    public void consultaMaiorCompraAno() {
        controleVendasService.consultaMaiorCompraAno();
    }

    //    GET: /clientes-fieis - Retornar o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.
    @GetMapping("clientes-fieis")
    public void consultaClientesFieis() {
        controleVendasService.consultaClientesFieis();
    }

    //  GET: /recomendacao/cliente/tipo - Retornar uma recomendação de vinho baseado nos tipos de vinho que o cliente mais compra
    @GetMapping("recomendacao/cliente/tipo")
    public void consultaRecomendacao() {
        controleVendasService.consultaRecomendacao();
    }

}
