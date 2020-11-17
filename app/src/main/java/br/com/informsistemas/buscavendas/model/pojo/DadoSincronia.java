package br.com.informsistemas.buscavendas.model.pojo;

import java.io.Serializable;
import java.util.Date;

public class DadoSincronia implements Serializable {

    public String codigoconfiguracao;
    public String cnpj;
    public String codigoaplicacao;
    public Date dataatualizacao;

    public DadoSincronia(String codigoconfiguracao, String cnpj, String codigoaplicacao, Date dataatualizacao) {
        this.codigoconfiguracao = codigoconfiguracao;
        this.cnpj = cnpj;
        this.codigoaplicacao = codigoaplicacao;
        this.dataatualizacao = dataatualizacao;
    }
}
