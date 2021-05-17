package com.example.app_brq.UI.model
import com.example.app_brq.UI.ListaGlobal
import java.io.Serializable

class Movimentacao(
        val valor: Double,
        val data: String,
        val categoria: String,
        val descricao: String,
        val tipoMovimentacao: String
): Serializable {

    fun adicionaMovimentacao(){
        ListaGlobal.adicionaMovimentacao(this)
    }
}