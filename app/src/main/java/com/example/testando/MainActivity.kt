package com.example.testando

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        setContentView(R.layout.activity_main)
        val btLogin = findViewById<Button>(R.id.buttonFazLogin)
        btLogin.setOnClickListener {
            val tLogin = findViewById<TextView>(R.id.editTextLogin)
            val tSenha = findViewById<TextView>(R.id.editTextSenha)
            val login = tLogin.text.toString()
            val senha = tSenha.text.toString()
            if(login == "aluno" && senha == "123") {
                Toast.makeText(this, "Bem vindo, login realizado com sucesso", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity2::class.java)
                val params = Bundle()
                params.putString("nome", login)
                intent.putExtras(params)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Login ou Senha incorretos!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}