package br.com.informsistemas.buscavendas.model.dao;

import android.content.Context;

import com.j256.ormlite.stmt.QueryBuilder;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.pojo.Material;
import br.com.informsistemas.buscavendas.model.pojo.MaterialSaldo;

public class MaterialSaldoDAO extends BaseDAO<MaterialSaldo> {

    private static MaterialSaldoDAO dao;

    public static MaterialSaldoDAO getInstance(Context context){
        if (dao == null){
            dao = new MaterialSaldoDAO(context);
        }

        return dao;
    }

    private MaterialSaldoDAO(Context context){
        super();
        super.ctx = context;
    }

    public Boolean isMaterialSaldo(Integer movimentoid, String codigomaterial){
        List<MaterialSaldo> listMaterialSaldo = null;
        Boolean value = false;

        try{
            QueryBuilder<MaterialSaldo, Object> queryBuilder = getHelper().getDAO(MaterialSaldo.class).queryBuilder();
            queryBuilder.where().eq("movimentoid", movimentoid).and().eq("codigomaterial", codigomaterial);

            listMaterialSaldo = queryBuilder.query();

            if (listMaterialSaldo.size() == 0){
                value = false;
            }else{
                value = true;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }

        return value;
    }

    public BigDecimal getSaldoDisponivel(String codigomaterial, BigDecimal saldo){
        List<MaterialSaldo> listMaterialSaldo = null;
        BigDecimal value = new BigDecimal(0);

        try {
            QueryBuilder<MaterialSaldo, Object> queryBuilder = getHelper().getDAO(MaterialSaldo.class).queryBuilder();
            queryBuilder.where().eq("codigomaterial", codigomaterial);

            listMaterialSaldo = queryBuilder.query();

            if (listMaterialSaldo == null){
                value = saldo;
            }else {
                for (int i = 0; i < listMaterialSaldo.size(); i++) {
                    value = value.add(listMaterialSaldo.get(i).saldo);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }

        return saldo.subtract(value);
    }

//    public List<MaterialSaldo> pesquisaLista(String s){
//        List<MaterialSaldo> materialSaldo = new ArrayList<>();
//
//        for (MaterialSaldo m : Constants.DTO.listMaterialSaldo){
//
//            if (m.descricao.toUpperCase().contains(s.toUpperCase()) || m.unidade.toUpperCase().contains(s.toUpperCase()) || m.precovenda1.toString().toUpperCase().contains(s.toUpperCase())){
//                materialSaldo.add(m);
//            }
//        }
//
//        return materialSaldo;
//    }

}
