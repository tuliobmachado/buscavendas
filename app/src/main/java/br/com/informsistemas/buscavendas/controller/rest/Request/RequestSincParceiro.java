package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.DadoSincronia;

public class RequestSincParceiro extends DadoSincronia {

    public String codigofuncionario;
    public String estado;

    public RequestSincParceiro(String codigofuncionario, String codigoconfiguracao, String cnpj,  Date dataatualizacao) {
        super(codigoconfiguracao, cnpj, Constants.DTO.registro.codigoaplicacao, dataatualizacao);
        this.codigofuncionario = codigofuncionario;
        this.estado = Constants.DTO.registro.estado;
    }
}
