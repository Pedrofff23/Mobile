package com.example.testando

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        setSupportActionBar(findViewById(R.id.toolbar2))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val textView = findViewById<TextView>(R.id.resultado)

        val args = intent.extras
        val resultado = args?.getString("resultado")
        textView.text = "O carrinho deu: $resultado"

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        menu.setGroupVisible(R.id.primeira_tela, false)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.action_search) {
            Toast.makeText(this, "Pedido confirmado", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        } else if (id == R.id.fechar) {
            finishAffinity()
        }
        return super.onOptionsItemSelected(item)
    }

}