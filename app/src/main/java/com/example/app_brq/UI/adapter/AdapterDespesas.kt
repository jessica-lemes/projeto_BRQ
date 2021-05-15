package com.example.app_brq.UI.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app_brq.R
import com.example.app_brq.UI.adapter.viewholder.ViewHolderMovimentacao
import com.example.app_brq.UI.model.Movimentacao

class AdapterDespesas(val arrayDeMovimentacao: ArrayList<Movimentacao>, val context: Context):
        RecyclerView.Adapter<ViewHolderMovimentacao>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovimentacao {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.lista_movimentacoes, parent,false)
        return ViewHolderMovimentacao(view)
    }

    override fun onBindViewHolder(holder: ViewHolderMovimentacao, position: Int) {
        arrayDeMovimentacao[position].apply {
            holder.textViewValor.text = this.valor.toString()
            holder.textViewData.text = this.data
            holder.textViewCategoria.text = this.categoria
            holder.textViewDescricao.text = this.descricao
        }
    }

    override fun getItemCount(): Int {
        return arrayDeMovimentacao.size
    }


}