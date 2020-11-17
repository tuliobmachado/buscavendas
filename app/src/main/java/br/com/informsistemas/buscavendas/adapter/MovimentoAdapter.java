package br.com.informsistemas.buscavendas.adapter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.informsistemas.buscavendas.R;
import br.com.informsistemas.buscavendas.model.dao.MovimentoNFeDAO;
import br.com.informsistemas.buscavendas.model.dao.ParceiroDAO;
import br.com.informsistemas.buscavendas.model.helper.Misc;
import br.com.informsistemas.buscavendas.model.pojo.Movimento;
import br.com.informsistemas.buscavendas.model.pojo.MovimentoNFe;
import br.com.informsistemas.buscavendas.model.pojo.Parceiro;
import br.com.informsistemas.buscavendas.viewholder.MovimentoViewHolder;

public class MovimentoAdapter extends RecyclerView.Adapter<MovimentoViewHolder> {

    private List<Movimento> fList;
    private List<Integer> selectedIds = new ArrayList<>();
    private LayoutInflater fLayoutInflater;
    private Context context;
    private MovimentoViewHolder.onMovimentoListener vOnMovimentoListener;

    public MovimentoAdapter(Context context, List<Movimento> fList, MovimentoViewHolder.onMovimentoListener onMovimentoListener) {
        this.fList = fList;
        this.context = context;
        this.fLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.vOnMovimentoListener = onMovimentoListener;
    }

    @NonNull
    @Override
    public MovimentoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = fLayoutInflater.inflate(R.layout.recycler_item_movimento, viewGroup, false);
        return new MovimentoViewHolder(v, vOnMovimentoListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MovimentoViewHolder movimentoViewHolder, int position) {
        Boolean selecionado = false;
        Parceiro p = ParceiroDAO.getInstance(context).findByIdAuxiliar("codigoparceiro", fList.get(position).codigoparceiro);
        MovimentoNFe m = MovimentoNFeDAO.getInstance(context).findByIdAuxiliar("movimento_id", fList.get(position).id);
        List<MovimentoNFe> ml = MovimentoNFeDAO.getInstance(context).findAll();

        if (fList.get(position).sincronizado.equals("T")) {
            movimentoViewHolder.frmStatus.setBackgroundColor(context.getResources().getColor(R.color.movSincronizado));
        } else if (fList.get(position).sincronizado.equals("P")) {
            movimentoViewHolder.frmStatus.setBackgroundColor(context.getResources().getColor(R.color.parceiroAVencer));
        } else {
            movimentoViewHolder.frmStatus.setBackgroundColor(context.getResources().getColor(R.color.movNaoSincronizado));
        }

        if (p == null){
            movimentoViewHolder.txtCodigoParceiro.setText(fList.get(position).codigoparceiro);
            movimentoViewHolder.txtDescricao.setText(fList.get(position).descricaoparceiro);
        }else {
            movimentoViewHolder.txtCodigoParceiro.setText(p.codigoparceiro);
            movimentoViewHolder.txtDescricao.setText(p.descricao);
        }

        movimentoViewHolder.txtTotalLiquido.setText("R$ " + Misc.formatMoeda(fList.get(position).totalliquido.floatValue()));

        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) movimentoViewHolder.txtTotalLiquido.getLayoutParams();


        if (m != null){
            movimentoViewHolder.imgInfo.setVisibility(View.VISIBLE);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
        }else{
            movimentoViewHolder.imgInfo.setVisibility(View.GONE);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 1);
        }

        movimentoViewHolder.txtTotalLiquido.setLayoutParams(layoutParams);

        for (int i : selectedIds) {
            if (fList.get(position).id == i) {
                selecionado = true;
            }
        }

        if (selecionado) {
            movimentoViewHolder.cardView.setForeground(new ColorDrawable(ContextCompat.getColor(context, R.color.cardSelecionado)));
        } else {
            movimentoViewHolder.cardView.setForeground(new ColorDrawable(ContextCompat.getColor(context, android.R.color.transparent)));
        }
    }

    @Override
    public int getItemCount() {
        if (fList != null) {
            return fList.size();
        } else
            return 0;
    }

    public void setSelectedIds(List<Integer> selectedIds) {
        this.selectedIds = selectedIds;
        notifyDataSetChanged();
    }
}
