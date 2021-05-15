package com.example.app_brq.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_brq.R
import com.example.app_brq.UI.adapter.AdapterMovimentacoes
import com.example.app_brq.UI.model.Movimentacao
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener

class PrincipalActivity : AppCompatActivity() {

    lateinit var calendarView: MaterialCalendarView
    lateinit var textUsuario: TextView
    lateinit var textSaldo: TextView
    lateinit var recyclerView: RecyclerView
    lateinit var arrayDeMovimentacao: ArrayList<Movimentacao>
    var movimentacao = Movimentacao(0.0, "","","" )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        carregarElementos()
        carregarEventos()

        arrayDeMovimentacao = movimentacao.carregaListaMovimentacoes()
        recyclerView.adapter = AdapterMovimentacoes(arrayDeMovimentacao, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    private fun carregarElementos() {
        calendarView = findViewById(R.id.calendarView)
        textSaldo = findViewById(R.id.textSaldo)
        textUsuario = findViewById(R.id.textUsuario)
        recyclerView = findViewById(R.id.recyclerPrincipal)

    }

    private fun carregarEventos() {
        configuraCalendarView()

    }




    fun adicionarReceita(view: View){
        val intent = Intent(this,ReceitasActivity::class.java)
        startActivity(intent)
    }

    fun adicionarDespesa(view: View){
        val intent = Intent(this,DespesasActivity::class.java)
        startActivity(intent)
    }

    fun configuraCalendarView(){
        var meses = arrayOf<String>("Janeiro", "Fevereiro", "Março","Abril","Maio","Junho", "Julho","Agosto" ,"Setembro", "Outubro", "Novembro", "Dezembro" )
        calendarView.setTitleMonths(meses)
        calendarView.setOnMonthChangedListener(OnMonthChangedListener { widget, date ->  })
    }

}