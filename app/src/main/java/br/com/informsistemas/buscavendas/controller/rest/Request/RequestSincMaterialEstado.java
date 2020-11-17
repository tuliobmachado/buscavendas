package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.DadoSincronia;

public class RequestSincMaterialEstado extends DadoSincronia {

    public String estados;

    public RequestSincMaterialEstado(String estados, String codigoconfiguracao, String cnpj, Date dataatualizacao) {
        super(codigoconfiguracao, cnpj, Constants.DTO.registro.codigoaplicacao, dataatualizacao);
        this.estados = estados;
    }
}
