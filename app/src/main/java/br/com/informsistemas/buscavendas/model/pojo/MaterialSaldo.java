package br.com.informsistemas.buscavendas.model.pojo;

import com.google.gson.annotations.Expose;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.math.BigDecimal;

import br.com.informsistemas.buscavendas.model.utils.IEntidade;

@DatabaseTable(tableName = "materialsaldo")
public class MaterialSaldo implements IEntidade {

    @DatabaseField(generatedId = true)
    @Expose
    public Integer id;

    @DatabaseField
    @Expose
    public Integer movimentoid;

    @DatabaseField
    @Expose
    public String codigomaterial;

    @DatabaseField
    @Expose
    public BigDecimal saldo;

    public MaterialSaldo(){}
    public MaterialSaldo(Integer movimentoid, String codigomaterial, BigDecimal saldo) {
        this.movimentoid = movimentoid;
        this.codigomaterial = codigomaterial;
        this.saldo = saldo;
    }
}
