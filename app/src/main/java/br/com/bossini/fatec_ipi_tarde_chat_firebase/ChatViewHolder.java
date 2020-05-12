package br.com.bossini.fatec_ipi_tarde_chat_firebase;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder  extends RecyclerView.ViewHolder {

    private TextView dataNomeTextView;
    private TextView mensagemTextView;

    public ChatViewHolder (View raiz){
        super (raiz);
        this.dataNomeTextView = raiz.findViewById(R.id.dataNomeTextView);
        this.mensagemTextView = raiz.findViewById(R.id.mensagemTextView);
    }

    public TextView getDataNomeTextView() {
        return dataNomeTextView;
    }

    public void setDataNomeTextView(TextView dataNomeTextView) {
        this.dataNomeTextView = dataNomeTextView;
    }

    public TextView getMensagemTextView() {
        return mensagemTextView;
    }

    public void setMensagemTextView(TextView mensagemTextView) {
        this.mensagemTextView = mensagemTextView;
    }
}
