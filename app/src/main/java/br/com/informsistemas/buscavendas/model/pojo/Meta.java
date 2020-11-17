package br.com.informsistemas.buscavendas.model.pojo;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Meta implements Serializable {

    @Expose
    public String status;

    @Expose
    public String message;
}
