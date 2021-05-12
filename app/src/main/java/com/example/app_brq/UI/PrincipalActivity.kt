package com.example.app_brq.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.app_brq.R

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R .layout.activity_principal)
    }

    fun adicionarReceita(view: View){
        //abrir tela de receita
    }

    fun adicionarDespesa(view: View){
        //abrir tela de despesa
    }
}