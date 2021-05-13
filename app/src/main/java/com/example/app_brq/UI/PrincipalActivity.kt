package com.example.app_brq.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.app_brq.R
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener

class PrincipalActivity : AppCompatActivity() {

    lateinit var calendarView: MaterialCalendarView
    lateinit var textUsuario: TextView
    lateinit var textSaldo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R .layout.activity_principal)
        carregarElementos()
        carregarEventos()
    }
    private fun carregarElementos() {
        calendarView = findViewById(R.id.calendarView)
        textSaldo = findViewById(R.id.textSaldo)
        textUsuario = findViewById(R.id.textUsuario)
    }

    private fun carregarEventos() {
        configuraCalendarView()
            }


    fun adicionarReceita(view: View){
        //abrir tela de receita
    }

    fun adicionarDespesa(view: View){
        //abrir tela de despesa
    }

    fun configuraCalendarView(){
        var meses = arrayOf<String>("Janeiro", "Fevereiro", "Março","Abril","Maio","Junho", "Julho","Agosto" ,"Setembro", "Outubro", "Novembro", "Dezembro" )
        calendarView.setTitleMonths(meses)
        calendarView.setOnMonthChangedListener(OnMonthChangedListener { widget, date ->  })
    }

}