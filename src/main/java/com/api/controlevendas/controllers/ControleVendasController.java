package com.api.controlevendas.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class ControleVendasController {

    public static final String URL_CLIENTES = "http://www.mocky.io/v2/598b16291100004705515ec5";
    public static final String URL_COMPRAS = "http://www.mocky.io/v2/598b16861100004905515ec7";

    @GetMapping("urlclientes")
    public void consultaUrlClientes() {
        RestTemplate restTemplate = new RestTemplate();
        List<Object> response = restTemplate.getForObject(URL_CLIENTES, List.class);
        System.out.println(response);
    }

    @GetMapping("urlcompras")
    public void consultaUrlCompras(){
        RestTemplate restTemplate = new RestTemplate();
        List<Object> response = restTemplate.getForObject(URL_COMPRAS, List.class);
        System.out.println(response);
    }

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
