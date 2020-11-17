package br.com.informsistemas.buscavendas.model.pojo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

import br.com.informsistemas.buscavendas.model.utils.IEntidade;

@DatabaseTable(tableName = "registro")
public class Registro implements IEntidade {

    @DatabaseField(generatedId = true)
    public Integer id;

    @DatabaseField
    public String usuario;

    @DatabaseField
    public String senha;

    @DatabaseField
    public String imei;

    @DatabaseField
    public String cnpj;

    @DatabaseField
    public String token;

    @DatabaseField
    public String codigousuario;

    @DatabaseField
    public String nome;

    @DatabaseField
    public String status;

    @DatabaseField
    public String codigofilialcontabil;

    @DatabaseField
    public String codigofuncionario;

    @DatabaseField
    public String codigotabelapreco;

    @DatabaseField
    public String codigoempresa;

    @DatabaseField
    public String codigoalmoxarifado;

    @DatabaseField
    public String codigooperacao;

    @DatabaseField
    public String estado;

    @DatabaseField
    public String codigoconfiguracao;

    @DatabaseField
    public boolean utilizapauta;

    @DatabaseField
    public boolean utilizafatorpauta;

    @DatabaseField
    public boolean editaacrescimo;

    @DatabaseField
    public String valoracrescimo;

    @DatabaseField
    public boolean editadesconto;

    @DatabaseField
    public String valordesconto;

    @DatabaseField
    public float maximodesconto;

    @DatabaseField
    public boolean alteracusto;

    @DatabaseField
    public boolean alterapreco;

    @DatabaseField
    public boolean exibematerialsemsaldo;

    @DatabaseField
    public int casaspercentual;

    @DatabaseField
    public int casasquantidade;

    @DatabaseField
    public int casaspreco;

    @DatabaseField
    public Boolean obrigaobservacao;

    @DatabaseField
    public String codigooperacaoremessa;

    @DatabaseField
    public String codigooperacaoretorno;

    public String codigoaplicacao = "0005";

    public List<BuscaVendas> listbuscavendas;

    public int casasvalor = 4;

    public Registro(){}
    public Registro(String usuario, String senha, String imei, String cnpj, String token, String codigousuario,
                    String nome, String status, String codigofilialcontabil, String codigofuncionario,
                    String codigotabelapreco, String codigoempresa, String codigoalmoxarifado,
                    String codigooperacao, String estado, String codigoconfiguracao, String valoracrescimo,
                    String valordesconto, String codigooperacaoremessa, String codigooperacaoretorno, float maximodesconto,
                    int casaspercentual, int casasquantidade, int casaspreco, Boolean utilizapauta, Boolean utilizafatorpauta,
                    Boolean editaacrescimo, Boolean editadesconto, Boolean alteracusto, Boolean alterapreco,
                    Boolean exibematerialsemsaldo, Boolean obrigaobservacao) {
        this.usuario = usuario;
        this.senha = senha;
        this.imei = imei;
        this.cnpj = cnpj;
        this.token = token;
        this.nome = nome;
        this.codigousuario = codigousuario;
        this.status = status;
        this.codigofilialcontabil = codigofilialcontabil;
        this.codigofuncionario = codigofuncionario;
        this.codigotabelapreco = codigotabelapreco;
        this.codigoempresa = codigoempresa;
        this.codigoalmoxarifado = codigoalmoxarifado;
        this.codigooperacao = codigooperacao;
        this.estado = estado;
        this.codigoconfiguracao = codigoconfiguracao;
        this.codigooperacaoremessa = codigooperacaoremessa;
        this.codigooperacaoretorno = codigooperacaoretorno;
        this.valoracrescimo = valoracrescimo;
        this.valordesconto = valordesconto;
        this.maximodesconto = maximodesconto;
        this.utilizapauta = utilizapauta;
        this.utilizafatorpauta = utilizafatorpauta;
        this.editaacrescimo = editaacrescimo;
        this.editadesconto = editadesconto;
        this.alteracusto = alteracusto;
        this.alterapreco = alterapreco;
        this.exibematerialsemsaldo = exibematerialsemsaldo;
        this.casaspercentual = casaspercentual;
        this.casasquantidade = casasquantidade;
        this.casaspreco = casaspreco;
        this.obrigaobservacao = obrigaobservacao;
    }
}
