package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.DadoSincronia;

public class RequestSincMetaFuncionario extends DadoSincronia {

    public String codigometa;
    public String codigofuncionario;

    public RequestSincMetaFuncionario(String codigometa, String codigofuncionario, String codigoconfiguracao, String cnpj, Date dataatualizacao) {
        super(codigoconfiguracao, cnpj, Constants.DTO.registro.codigoaplicacao, dataatualizacao);
        this.codigometa = codigometa;
        this.codigofuncionario = codigofuncionario;
    }
}
