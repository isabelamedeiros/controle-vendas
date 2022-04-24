package com.api.controlevendas.services;

import com.api.controlevendas.dto.Clientes;
import com.api.controlevendas.dto.Compras;
import com.api.controlevendas.dto.Itens;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ControleVendasService {

    public static final String URL_CLIENTES = "http://www.mocky.io/v2/598b16291100004705515ec5";
    public static final String URL_COMPRAS = "http://www.mocky.io/v2/598b16861100004905515ec7";


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

    /*
     *
     *
     *
     */

    //TODO Falta implementar os metodos abaixo

    //    GET: /maior-compra/ano - (Exemplo: /maior_compra/2016) - Retornar a maior compra do ano informado com dados da compra
    public String consultaMaiorCompraAno() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_COMPRAS, String.class);
        return response.toString();
    }


    //    GET: /clientes-fieis - Retornar o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.
    public String consultaClientesFieis() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_COMPRAS, String.class);
        return response.toString();
    }


    //  GET: /recomendacao/cliente/tipo - Retornar uma recomendação de vinho baseado nos tipos de vinho que o cliente mais compra
    public String consultaRecomendacao() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_COMPRAS, String.class);
        return response.toString();
    }

}
