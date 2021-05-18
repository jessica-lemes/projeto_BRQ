package com.example.app_brq.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_brq.R
import com.example.app_brq.UI.adapter.AdapterMovimentacoes
import com.example.app_brq.UI.model.Movimentacao
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ReceitasActivity : AppCompatActivity() {

    lateinit var recyclerReceitas: RecyclerView
    lateinit var editTextValorReceita: TextView
    lateinit var editTextDataReceita: TextView
    lateinit var editTextCategoriaReceita: TextView
    lateinit var editTextDescricaoReceita: TextView
    lateinit var fabReceita: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas)

        carregarElementos()
        carregarEventos()

    }

    override fun onRestart() {
        super.onRestart()
        carregarElementos()
        carregarEventos()
    }

    private fun carregarElementos() {
        recyclerReceitas = findViewById(R.id.recyclerReceitas)
        editTextValorReceita = findViewById(R.id.editTextValorReceita)
        editTextDataReceita = findViewById(R.id.editTextDataReceita)
        editTextCategoriaReceita = findViewById(R.id.editTextCategoriaReceita)
        editTextDescricaoReceita = findViewById(R.id.editTextDescricaoReceita)
        fabReceita = findViewById(R.id.fabReceita)

    }

    private fun carregarEventos() {
        atualizaRecycler()
    }

    fun mostraDadoOnClick(view: View){

        val valor = editTextValorReceita.text
        val valorString = valor.toString()
        val data = editTextDataReceita.text
        val categoria = editTextCategoriaReceita.text
        val descricao = editTextDescricaoReceita.text

        val dados = Movimentacao(valorString.toDouble(), data.toString(),categoria.toString(),descricao.toString() ,"Receita")
        dados.adicionaMovimentacao()

        atualizaRecycler()
    }

    fun atualizaRecycler(){
        val lista: ArrayList<Movimentacao> = ListaGlobal.retornaListaMovimentacao()
        var listaFiltrada = lista.filter { it.tipoMovimentacao == "Receita" }
        recyclerReceitas.adapter = AdapterMovimentacoes(ArrayList(listaFiltrada), this)
        recyclerReceitas.layoutManager = LinearLayoutManager(this)
    }

}