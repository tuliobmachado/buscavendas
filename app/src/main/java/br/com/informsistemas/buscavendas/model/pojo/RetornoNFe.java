package br.com.informsistemas.buscavendas.model.pojo;

import com.google.gson.annotations.Expose;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.utils.IEntidade;

public class RetornoNFe implements IEntidade {

    @Expose
    public String codigoautorizacao;

    @Expose
    public String mensagem;

    @Expose
    public String chave;

    @Expose
    public String numeroprotocolo;

    @Expose
    public Date dataautorizacao;

    @Expose
    public Integer numeronota;

}
