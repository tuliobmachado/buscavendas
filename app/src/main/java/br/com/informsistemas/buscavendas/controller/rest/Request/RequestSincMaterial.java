package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.DadoSincronia;

public class RequestSincMaterial extends DadoSincronia {

    public String codigooperacao;
    public String codigofuncionario;

    public RequestSincMaterial(String codigoconfiguracao, String cnpj, Date dataatualizacao) {
        super(codigoconfiguracao, cnpj, Constants.DTO.registro.codigoaplicacao, dataatualizacao);

        this.codigofuncionario = Constants.DTO.registro.codigofuncionario;
        this.codigooperacao = Constants.DTO.registro.codigooperacaoremessa;
    }
}
