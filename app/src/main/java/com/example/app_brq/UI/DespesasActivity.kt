package com.example.app_brq.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_brq.R
import com.example.app_brq.UI.adapter.AdapterMovimentacoes
import com.example.app_brq.UI.model.Movimentacao
import com.github.clans.fab.FloatingActionButton

class DespesasActivity : AppCompatActivity() {

    lateinit var recyclerDespesas: RecyclerView
    lateinit var editTextValorDespesa: TextView
    lateinit var editTextDataDespesa: TextView
    lateinit var editTextCategoriaDespesa: TextView
    lateinit var editTextDescricaoDespesa: TextView
    lateinit var fabDespesa: FloatingActionButton

    lateinit var arrayDeDespesas: ArrayList<Movimentacao>
    var movimentacao = Movimentacao(0.0, "","","" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_despesas)

        carregarElementos()
        carregarEventos()

        arrayDeDespesas = movimentacao.carregaListaDespesas()
        recyclerDespesas.adapter = AdapterMovimentacoes(arrayDeDespesas, this)
        recyclerDespesas.layoutManager = LinearLayoutManager(this)
    }
    private fun carregarElementos() {
        recyclerDespesas = findViewById(R.id.recyclerDespesas)
        editTextValorDespesa = findViewById(R.id.editTextValorDespesa)
        editTextDataDespesa = findViewById(R.id.editTextDataDespesa)
        editTextCategoriaDespesa = findViewById(R.id.editTextCategoriaDespesa)
        editTextDescricaoDespesa = findViewById(R.id.editTextDescricaoDespesa)

    }

    private fun carregarEventos() {

    }
}