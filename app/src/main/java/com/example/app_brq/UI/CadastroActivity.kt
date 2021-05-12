package com.example.app_brq.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.app_brq.R

class CadastroActivity : AppCompatActivity() {
    lateinit var nome : EditText
    lateinit var cpf : EditText
    lateinit var email :EditText
    lateinit var senha : EditText
    lateinit var ConfirmSenha : EditText
    lateinit var btn : Button
    lateinit var telacad : View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        carregarElementos()
        carregarEventos()
    }



    private fun carregarElementos() {
        nome = findViewById(R.id.inputNome)
        cpf = findViewById(R.id.inputCPF)
        email = findViewById(R.id.inputEmail)
        senha = findViewById(R.id.inputSenha)
        ConfirmSenha = findViewById(R.id.inputConfirmaSenha)
        btn = findViewById(R.id.btnCadastrar)
        telacad = findViewById(R.id.TelaCad)
    }

    private fun carregarEventos() {
        btn.setOnClickListener {
            if(nome.length() <= 0  || cpf.length() == 0 && email.length() == 0 && senha.length() == 0
                && ConfirmSenha.length()==0) {
                btn.text = "ERRO"
                }else{
                var intent = Intent(this,PrincipalActivity::class.java)
                startActivity(intent)
            }
            }
        }
    }
//
//
