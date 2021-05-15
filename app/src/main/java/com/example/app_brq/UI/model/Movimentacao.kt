package com.example.app_brq.UI.model

import android.widget.TextView
import com.example.app_brq.R

class Movimentacao(
        val valor: Double,
        val data: String,
        val categoria: String,
        val descricao: String
) {

    fun carregaListaMovimentacoes(): ArrayList<Movimentacao> {

        val lista = arrayListOf<Movimentacao>()
        Movimentacao(120.50, "15/05/2021", "Salário", "Hora extra").let {
            lista.add(it)
        }
        Movimentacao(-250.99, "18/05/2021", "Compras", "Compras no supermercado").let {
            lista.add(it)
        }
        return lista

    }

    fun carregaListaDespesas(): ArrayList<Movimentacao> {

        val lista = arrayListOf<Movimentacao>()
        Movimentacao(-100.00, "05/05/2021", "Compras", "Ingresso para o show").let {
            lista.add(it)
        }
        Movimentacao(-250.99, "18/05/2021", "Compras", "Compras no supermercado").let {
            lista.add(it)
        }
        return lista
    }

    fun carregaListaReceitas(): ArrayList<Movimentacao> {

        val lista = arrayListOf<Movimentacao>()
        Movimentacao(150.00, "25/05/2021", "Salário", "Hora extra").let {
            lista.add(it)
        }
        Movimentacao(500.45, "28/05/2021", "Restituição IR", "Restituição IR 2020").let {
            lista.add(it)
        }
        return lista
    }
}