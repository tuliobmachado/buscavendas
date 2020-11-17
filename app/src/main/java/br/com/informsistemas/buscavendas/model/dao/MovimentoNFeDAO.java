package br.com.informsistemas.buscavendas.model.dao;

import android.content.Context;

import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.List;

import br.com.informsistemas.buscavendas.model.pojo.Movimento;
import br.com.informsistemas.buscavendas.model.pojo.MovimentoNFe;

public class MovimentoNFeDAO extends BaseDAO<MovimentoNFe> {

    private static MovimentoNFeDAO dao;

    public static MovimentoNFeDAO getInstance(Context context){
        if (dao == null){
            dao = new MovimentoNFeDAO(context);
        }

        return dao;
    }

    private MovimentoNFeDAO(Context context){
        super();
        super.ctx = context;
    }
}
