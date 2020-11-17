package br.com.informsistemas.buscavendas.viewholder;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import br.com.informsistemas.buscavendas.R;

public class MovimentoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtCodigoParceiro;
    public TextView txtDescricao;
    public TextView txtTotalLiquido;
    public ImageView imgInfo;
    public CardView cardView;
    public FrameLayout frmStatus;
    private onMovimentoListener vOnMovimentoListener;

    public MovimentoViewHolder(View itemView, onMovimentoListener onMovimentoListener){
        super(itemView);

        txtCodigoParceiro = itemView.findViewById(R.id.txt_codigo_parceiro);
        txtDescricao = itemView.findViewById(R.id.txt_descricao);
        txtTotalLiquido = itemView.findViewById(R.id.txt_total_liquido);
        imgInfo = itemView.findViewById(R.id.img_informacoes);
        frmStatus = itemView.findViewById(R.id.frm_status);
        cardView = itemView.findViewById(R.id.card_movimento);
        vOnMovimentoListener = onMovimentoListener;

        itemView.setOnClickListener(this);
        imgInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.img_informacoes:
                vOnMovimentoListener.onInfoClick(getAdapterPosition());
                break;
            default:
                vOnMovimentoListener.onItemClick(getAdapterPosition());
                break;
        }
    }

    public interface onMovimentoListener{
        void onItemClick(int position);
        void onInfoClick(int position);
    }
}
