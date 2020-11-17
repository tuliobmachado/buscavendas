package br.com.informsistemas.buscavendas.controller.rest.Request;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.DadoSincronia;

public class RequestSincMaterialSaldo extends DadoSincronia {

    public String codigomaterial;
    public String codigoalmoxarifado;

    public RequestSincMaterialSaldo(String codigomaterial, String codigoalmoxarifado, String codigoconfiguracao, String cnpj, Date dataatualizacao) {
        super(codigoconfiguracao, cnpj, Constants.DTO.registro.codigoaplicacao, dataatualizacao);
        this.codigomaterial = codigomaterial;
        this.codigoalmoxarifado = codigoalmoxarifado;
    }
}
