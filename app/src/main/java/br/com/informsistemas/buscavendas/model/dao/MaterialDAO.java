package br.com.informsistemas.buscavendas.model.dao;

import android.content.Context;

import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.informsistemas.buscavendas.model.helper.Constants;
import br.com.informsistemas.buscavendas.model.helper.Misc;
import br.com.informsistemas.buscavendas.model.pojo.CategoriaMaterial;
import br.com.informsistemas.buscavendas.model.pojo.Material;

public class MaterialDAO extends BaseDAO<Material> {

    private static MaterialDAO dao;
    private List<Material> listPesquisa;

    public static MaterialDAO getInstance(Context context){
        if (dao == null){
            dao = new MaterialDAO(context);
        }

        return dao;
    }

    private MaterialDAO(Context context){
        super();
        super.ctx = context;
    }

    public List<Material> pesquisaLista(String s, List<Material> listFiltro) {
        List<Material> materialList = new ArrayList<>();

        for (Material m : listPesquisa){
            if (m.descricao.toUpperCase().contains(s.toUpperCase())) {
                materialList.add(m);
            }
        }

        return materialList;
    }

    public void setListPesquisa(List<Material> listPesquisa) {
        this.listPesquisa = listPesquisa;
    }

    public List<Material> aplicarFiltro(String codigogrupo){
        List<Material> items = null;

        try{
            QueryBuilder<Material, Object> materialQB = getHelper().getDAO(Material.class).queryBuilder();
            QueryBuilder<CategoriaMaterial, Object> categoriaMaterialDB = getHelper().getDAO(CategoriaMaterial.class).queryBuilder();
            categoriaMaterialDB.where().eq("codigogrupo", codigogrupo);

            items = materialQB.join("codigomaterial", "codigomaterial", categoriaMaterialDB).query();
        } catch (SQLException e){
            e.printStackTrace();
        }

        return items;
    }

    public List<Material> getListMaterial() {

        List<Material> listMaterial = null;
        try {
            listMaterial = new Misc().cloneMaterialPesquisa(Constants.DTO.listPesquisaMaterial);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return listMaterial;
    }

    public List<Material> findAllOrderDescricao(){
        List<Material> items = new ArrayList<>();

        QueryBuilder<Material, Object> queryBuilder = getHelper().getDAO(Material.class).queryBuilder();
        try {
            queryBuilder.orderBy("descricao", true);

            items = queryBuilder.query();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }
}
