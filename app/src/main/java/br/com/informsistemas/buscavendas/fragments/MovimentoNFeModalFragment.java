package br.com.informsistemas.buscavendas.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import br.com.informsistemas.buscavendas.R;
import br.com.informsistemas.buscavendas.model.helper.Misc;
import br.com.informsistemas.buscavendas.model.pojo.MovimentoNFe;

public class MovimentoNFeModalFragment extends DialogFragment {

    private TextView txtNumeroNota;
    private TextView txtDataAutorizacao;
    private TextView txtCodigoAutorizacao;
    private TextView txtProtocolo;
    private TextView txtMensagem;
    private TextView txtChave;
    private MovimentoNFe movimentoNFe;

    public static MovimentoNFeModalFragment newInstance(){
        MovimentoNFeModalFragment frag = new MovimentoNFeModalFragment();
        return frag;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.DialogDefault);
        builder.setTitle("Informações");

        movimentoNFe = (MovimentoNFe) getArguments().getSerializable("movimentonfe");

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.fragment_modal_movimento_nfe, null);

        getFindIds(view);
        builder.setView(view);

        builder.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        return builder.create();
    }

    private void getFindIds(View v){
        txtNumeroNota = v.findViewById(R.id.txtValorNumeroNota);
        txtDataAutorizacao = v.findViewById(R.id.txtValorDataAutorizacao);
        txtCodigoAutorizacao = v.findViewById(R.id.txtValorCodigoAutorizacao);
        txtProtocolo = v.findViewById(R.id.txtValorProtocolo);
        txtMensagem = v.findViewById(R.id.txtValorMensagem);
        txtChave = v.findViewById(R.id.txtValorChave);

        txtNumeroNota.setText(String.valueOf(movimentoNFe.numeronota));
        txtDataAutorizacao.setText(Misc.formatDate(movimentoNFe.dataautorizacao, "dd/MM/yyyy"));
        txtCodigoAutorizacao.setText(movimentoNFe.codigoautorizacao);
        txtProtocolo.setText(movimentoNFe.numeroprotocolo);
        txtMensagem.setText(movimentoNFe.mensagem);
        txtChave.setText(movimentoNFe.chave);
    }

}
