package com.api.controlevendas.services;

import com.api.controlevendas.dto.Clientes;
import com.api.controlevendas.dto.Compras;
import com.api.controlevendas.dto.Itens;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class ControleVendasService {

    public static final String URL_CLIENTES = "http://www.mocky.io/v2/598b16291100004705515ec5";
    public static final String URL_COMPRAS = "http://www.mocky.io/v2/598b16861100004905515ec7";

//    @Autowired
//    private final RestTemplate restTemplate;
//
//    private ControleVendasService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    public void consultarBaseClientes() {
        RestTemplate restTemplate = new RestTemplate();
        List<Object> response = restTemplate.getForObject(URL_CLIENTES, List.class);
        System.out.println(response);
    }

    public void consultarBaseCompras() {
        RestTemplate restTemplate = new RestTemplate();
        List<Object> response = restTemplate.getForObject(URL_COMPRAS, List.class);
        System.out.println(response);
    }

    public void consultarClientesOrdenados() {
        RestTemplate restTemplate = new RestTemplate();
        Clientes[] response = restTemplate.getForObject(URL_CLIENTES, Clientes[].class);
        Clientes[] clienteArray = response;

        System.out.println(Arrays.stream(clienteArray)
                .map(Clientes::getNome)
                .sorted()
                .collect(Collectors.toList()));
    }

    public void consultarValorTotalOrdenado() {
        RestTemplate restTemplate = new RestTemplate();
        Compras[] response = restTemplate.getForObject(URL_COMPRAS, Compras[].class);
        Compras[] valorTotalArray = response;

        System.out.println(Arrays.stream(valorTotalArray)
                .map(Compras::getValorTotal)
                .sorted()
                .collect(Collectors.toList()));
    }

    public String consultaOrdenadaCompras() {
        RestTemplate restTemplate = new RestTemplate();
        Itens[] response = restTemplate.getForObject(URL_COMPRAS, Itens[].class);

        List compras = Arrays.stream(response)
                .map(Itens::getPreco)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(compras);

        return compras.toString();
    }

    public void consultaMaiorCompraTotal() {
        RestTemplate restTemplate = new RestTemplate();
        Compras[] response = restTemplate.getForObject(URL_COMPRAS, Compras[].class);

        List compras = Arrays.stream(response)
                .map(Compras::getValorTotal)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(compras.get(0));
    }

    /*
     *
     *
     *
     */

    //TODO Falta implementar os metodos abaixo

    //    GET: /maior-compra/ano - (Exemplo: /maior_compra/2016) - Retornar a maior compra do ano informado com dados da compra
    public void consultaMaiorCompraAno() {
        RestTemplate restTemplate = new RestTemplate();
        Compras[] response = restTemplate.getForObject(URL_COMPRAS, Compras[].class);

        List compras = Arrays.stream(response)
                .map(Compras::getValorTotal)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(compras.get(0));
    }


    //    GET: /clientes-fieis - Retornar o Top 3 clientes mais fi??is, clientes que possuem mais compras recorrentes com maiores valores.
    public String consultaClientesFieis() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_COMPRAS, String.class);
        return response.toString();
    }


    //  GET: /recomendacao/cliente/tipo - Retornar uma recomenda????o de vinho baseado nos tipos de vinho que o cliente mais compra
    public String consultaRecomendacao() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_COMPRAS, String.class);
        return response.toString();
    }

}