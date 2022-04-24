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

    /*
     *
     *
     *
     */
//TODO Falta implementar os metodos abaixo

    @GetMapping("compras")
//    GET: /compras - Retornar a lista de compras ordenadas de forma crescente por valor
    public String consultaOrdenadaCompras() {
        return "";
    }

    @GetMapping("maior-compra/ano")
//    GET: /maior-compra/ano - (Exemplo: /maior_compra/2016) - Retornar a maior compra do ano informado com dados da compra
    public String consultaMaiorCompraAno() {
        return "";
    }

    @GetMapping("clientes-fieis")
//    GET: /clientes-fieis - Retornar o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.
    public String consultaClientesFieis() {
        return "";
    }

    @GetMapping("recomendacao/cliente/tipo")
//  GET: /recomendacao/cliente/tipo - Retornar uma recomendação de vinho baseado nos tipos de vinho que o cliente mais compra
    public String consultaRecomendacao() {
        return "";
    }

}
