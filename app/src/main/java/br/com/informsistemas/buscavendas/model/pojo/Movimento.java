package br.com.informsistemas.buscavendas.model.pojo;

import com.google.gson.annotations.Expose;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.math.BigDecimal;
import java.util.Date;

import br.com.informsistemas.buscavendas.model.utils.IEntidade;

@DatabaseTable(tableName = "movimento")
public class Movimento implements IEntidade {

    @DatabaseField(generatedId = true)
    @Expose
    public Integer id;

    @DatabaseField
    @Expose
    public String codigoempresa;

    @DatabaseField
    @Expose
    public String codigofilialcontabil;

    @DatabaseField
    @Expose
    public String codigoalmoxarifado;

    @DatabaseField
    @Expose
    public String codigoparceiro;

    @DatabaseField
    @Expose
    public String codigooperacao;

    @DatabaseField
    @Expose
    public String codigotabelapreco;

    @DatabaseField
    @Expose
    public String observacao;

    @DatabaseField
    @Expose
    public BigDecimal totalliquido;

    @DatabaseField
    @Expose
    public String sincronizado;

    @DatabaseField
    @Expose
    public Date data;

    @DatabaseField
    @Expose
    public Date datainicio;

    @DatabaseField
    @Expose
    public Date datafim;

    @DatabaseField
    @Expose
    public Date dataalteracao;

    @DatabaseField
    @Expose
    public BigDecimal longitude;

    @DatabaseField
    @Expose
    public BigDecimal latitude;

    @DatabaseField
    @Expose
    public String MD5;

    @DatabaseField
    public String descricaoparceiro;

    @DatabaseField
    @Expose
    public String cpfcgc;

    public Movimento(){}
    public Movimento(String codigoempresa, String codigofilialcontabil, String codigoalmoxarifado, String codigooperacao,
                     String codigotabelapreco, String codigoparceiro, String observacao, BigDecimal totalliquido, String sincronizado,
                     Date data, Date datainicio, Date datafim, Date dataalteracao, BigDecimal longitude, BigDecimal latitude, String MD5,
                     String descricaoparceiro, String cpfcgc) {
        this.codigoempresa = codigoempresa;
        this.codigofilialcontabil = codigofilialcontabil;
        this.codigoalmoxarifado = codigoalmoxarifado;
        this.codigooperacao = codigooperacao;
        this.codigotabelapreco = codigotabelapreco;
        this.codigoparceiro = codigoparceiro;
        this.observacao = observacao;
        this.totalliquido = totalliquido;
        this.sincronizado = "F";
        this.data = data;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.dataalteracao = dataalteracao;
        this.longitude = longitude;
        this.latitude = latitude;
        this.MD5 = MD5;
        this.descricaoparceiro = descricaoparceiro;
        this.cpfcgc = cpfcgc;
    }
}
