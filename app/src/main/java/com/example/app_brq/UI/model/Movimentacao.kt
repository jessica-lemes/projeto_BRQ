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


    fun carregaListaMovimentacoes(): ArrayList<Movimentacao> {

        val lista: ArrayList<Movimentacao> = ListaGlobal().retornaListaMovimentacao()

//        val lista = arrayListOf<Movimentacao>()
//        Movimentacao(120.50, "15/05/2021", "Salário", "Hora extra", "Receita").let {
//            lista.add(it)
//        }
//        Movimentacao(-250.99, "18/05/2021", "Compras", "Compras no supermercado","Despesa").let {
//            lista.add(it)
//        }
        return lista
    }

    fun adicionaMovimentacao(){
        ListaGlobal().adicionaMovimentacao(this)
    }
}