package com.api.controlevendas.dto;

import java.util.ArrayList;

public class Compras {

    public String codigo;
    public String data;
    public String cliente;
    public ArrayList Itens;
    public double valorTotal;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList getItens() {
        return Itens;
    }

    public void setItens(ArrayList itens) {
        Itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}