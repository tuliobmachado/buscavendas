package br.com.informsistemas.buscavendas.controller.rest.Response;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import br.com.informsistemas.buscavendas.model.pojo.MaterialSaldo;
import br.com.informsistemas.buscavendas.model.pojo.RetornoNFe;

public class ResponsePedido implements Serializable {

    @Expose
    public Integer id;

    @Expose
    public List<MaterialSaldo> materialsaldo;

    @Expose
    public Date dataatualizacao;

    @Expose
    public String status;

    @Expose
    public RetornoNFe retornonfe;
}
