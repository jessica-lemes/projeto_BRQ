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

class DespesasActivity : AppCompatActivity() {

    lateinit var recyclerDespesas: RecyclerView
    lateinit var editTextValorDespesa: TextView
    lateinit var editTextDataDespesa: TextView
    lateinit var editTextCategoriaDespesa: TextView
    lateinit var editTextDescricaoDespesa: TextView
    lateinit var fabDespesa: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_despesas)

        carregarElementos()
        carregarEventos()

    }

    override fun onRestart() {
        super.onRestart()
        carregarElementos()
        carregarEventos()
    }

    private fun carregarElementos() {
        recyclerDespesas = findViewById(R.id.recyclerDespesas)
        editTextValorDespesa = findViewById(R.id.editTextValorDespesa)
        editTextDataDespesa = findViewById(R.id.editTextDataDespesa)
        editTextCategoriaDespesa = findViewById(R.id.editTextCategoriaDespesa)
        editTextDescricaoDespesa = findViewById(R.id.editTextDescricaoDespesa)
        fabDespesa = findViewById(R.id.fabDespesa)
    }

    private fun carregarEventos() {
        atualizaRecycler()
    }

    fun mostraDadoOnClick(view: View) {
        val valor = "-" + editTextValorDespesa.text
        val valorString = valor.toString()
        val data = editTextDataDespesa.text
        val categoria = editTextCategoriaDespesa.text
        val descricao = editTextDescricaoDespesa.text

        val dados = Movimentacao( valorString.toDouble(), data.toString(), categoria.toString(), descricao.toString(), "Despesa")
        dados.adicionaMovimentacao()
        atualizaRecycler()
    }

    fun atualizaRecycler() {
        val lista: ArrayList<Movimentacao> = ListaGlobal.retornaListaMovimentacao()
        var listaFiltrada = lista.filter { it.tipoMovimentacao=="Despesa" }
        recyclerDespesas.adapter = AdapterMovimentacoes(ArrayList(listaFiltrada), this)
        recyclerDespesas.layoutManager = LinearLayoutManager(this)
    }
}