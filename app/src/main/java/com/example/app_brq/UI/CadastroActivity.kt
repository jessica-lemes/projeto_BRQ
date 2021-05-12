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
        email = findViewById(R.id.inputEmailCad)
        senha = findViewById(R.id.inputSenhaCad)
        ConfirmSenha = findViewById(R.id.inputConfirmaSenha)
        btn = findViewById(R.id.btnCadastrar)
        telacad = findViewById(R.id.TelaCad)
    }

    fun validarCamposVazio():Boolean {

        nome.text.apply {
            val valor = this.toString()
            val naoValido = (valor.length < 3)
            if(naoValido){
                nome.error = "Nome Invalido"
            }else{
                nome.error = null
            }
        }
        cpf.text.apply {
            val valor = this.toString()
            val naoValido = (valor.length < 11)
            if(naoValido){
                cpf.error = "cpf Invalido necessario 11 dgitos"
            }else{
                cpf.error = null
            }
        }
        email.text.apply {
            val valor = this.toString()
            val naoValido = (valor.length < 7)
            if(naoValido){
                email.error = "E-mail Invalido"
            }else{
                email.error = null
            }
        }
        senha.text.apply {
            val valor = this.toString()
            val naoValido = (valor.length < 6)
            if(naoValido){
                senha.error = "senha incorreta Invalido"
            }else{
                senha.error = null
            }
        }
        ConfirmSenha.text.apply {
            val valor = this.toString()
            val valorSenha = senha.text.toString()
            val naoValido = valorSenha != valor
            if(naoValido){
                ConfirmSenha.error = "Senha nao confere"
            }else{
                ConfirmSenha.error = null
            }
        }
        return true
    }
    private fun carregarEventos() {
                btn.setOnClickListener{
                    val res = validarCamposVazio()
                    println(res)
              }
            }
        }
