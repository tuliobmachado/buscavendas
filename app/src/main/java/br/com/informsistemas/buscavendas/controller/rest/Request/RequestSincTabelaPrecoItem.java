package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.DadoSincronia;

public class RequestSincTabelaPrecoItem extends DadoSincronia {

    public String codigotabelapreco;
    public String codigooperacao;
    public String codigofuncionario;

    public RequestSincTabelaPrecoItem(String codigotabelapreco, String codigoconfiguracao, String cnpj, Date dataatualizacao) {
        super(codigoconfiguracao, cnpj, Constants.DTO.registro.codigoaplicacao, dataatualizacao);
        this.codigotabelapreco = codigotabelapreco;
        this.codigofuncionario = Constants.DTO.registro.codigofuncionario;
        this.codigooperacao = Constants.DTO.registro.codigooperacaoremessa;
    }
}
