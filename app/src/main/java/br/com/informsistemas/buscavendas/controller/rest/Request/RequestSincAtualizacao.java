package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.io.Serializable;

public class RequestSincAtualizacao implements Serializable {

    public String cnpj;
    public String codigoconfiguracao;
    public String codigoaplicacao;

    public RequestSincAtualizacao(String cnpj, String codigoconfiguracao, String codigoaplicacao) {
        this.cnpj = cnpj;
        this.codigoconfiguracao = codigoconfiguracao;
        this.codigoaplicacao = codigoaplicacao;
    }
}
