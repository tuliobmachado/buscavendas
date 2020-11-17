package br.com.informsistemas.buscavendas.model.pojo;

import com.google.gson.annotations.Expose;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

import br.com.informsistemas.buscavendas.model.utils.IEntidade;

@DatabaseTable(tableName = "movimentonfe")
public class MovimentoNFe implements IEntidade {

    @DatabaseField(generatedId = true)
    @Expose
    public Integer id;

    @DatabaseField(foreign = true, canBeNull = false, foreignAutoRefresh = true, columnName = "movimento_id")
    @Expose(serialize = false)
    public Movimento movimento;

    @DatabaseField
    @Expose
    public String codigoautorizacao;

    @DatabaseField
    @Expose
    public String numeroprotocolo;

    @DatabaseField
    @Expose
    public Integer numeronota;

    @DatabaseField
    @Expose
    public String mensagem;

    @DatabaseField
    @Expose
    public Date dataautorizacao;

    @DatabaseField
    @Expose
    public String chave;

    public MovimentoNFe(){}
    public MovimentoNFe(Movimento movimento, String codigoautorizacao, String numeroprotocolo, String mensagem, String chave, Integer numeronota, Date dataautorizacao){
        this.movimento = movimento;
        this.codigoautorizacao = codigoautorizacao;
        this.numeroprotocolo = numeroprotocolo;
        this.mensagem = mensagem;
        this.chave = chave;
        this.numeronota = numeronota;
        this.dataautorizacao = dataautorizacao;
    }



}
