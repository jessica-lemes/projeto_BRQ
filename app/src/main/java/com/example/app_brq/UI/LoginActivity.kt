package com.example.app_brq.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.app_brq.R

class LoginActivity : AppCompatActivity() {
    lateinit var campoEmail : EditText
    lateinit var campoSenha : EditText
    lateinit var botaoEnviar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        carregarElementos()
        carregarEventos()
    }
    private fun carregarElementos() {
        campoEmail = findViewById(R.id.inputEmailCad)
        campoSenha = findViewById(R.id.inputSenhaCad)
        botaoEnviar = findViewById(R.id.btnLogin)
    }
    private fun carregarEventos() {
        botaoEnviar.setOnClickListener {
            val email =  campoEmail.text.toString()
            val senha = campoSenha.text.toString()
            if(email == "Gabriel" && senha == "Gabriel"){
                val intent = Intent(this,PrincipalActivity::class.java)
                startActivity(intent)
            }else if(email == "Jessica" && senha == "Jessica"){
                val intent = Intent(this,PrincipalActivity::class.java)
                startActivity(intent)
            }else if (email == "Flavia" && senha == "Flavia"){
                val intent = Intent(this,PrincipalActivity::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this,CadastroActivity::class.java)
                startActivity(intent)
            }

        }
    }
}