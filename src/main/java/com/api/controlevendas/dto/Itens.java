package com.api.controlevendas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Itens {
        public String codigo;
        public String produto;
        public String variedade;
        public String pais;
        public String categoria;
        public String safra;
        public double preco;

        public String getCodigo() {
                return codigo;
        }

        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }

        public String getProduto() {
                return produto;
        }

        public void setProduto(String produto) {
                this.produto = produto;
        }

        public String getVariedade() {
                return variedade;
        }

        public void setVariedade(String variedade) {
                this.variedade = variedade;
        }

        public String getPais() {
                return pais;
        }

        public void setPais(String pais) {
                this.pais = pais;
        }

        public String getCategoria() {
                return categoria;
        }

        public void setCategoria(String categoria) {
                this.categoria = categoria;
        }

        public String getSafra() {
                return safra;
        }

        public void setSafra(String safra) {
                this.safra = safra;
        }

        public double getPreco() {
                return preco;
        }

        public void setPreco(double preco) {
                this.preco = preco;
        }
}
