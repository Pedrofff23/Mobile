package com.example.testando

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        setSupportActionBar(findViewById(R.id.toolbar2))

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        menu.setGroupVisible(R.id.primeira_tela, false)
        menu.setGroupVisible(R.id.excluir, false)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val Produto = findViewById<TextView>(R.id.produto)
        val Quantidade = findViewById<TextView>(R.id.quantidade)

        val produto = Produto.text.toString()
        val quantidade = (Quantidade.text.toString()).toInt()

        val resultado = quantidade * 26

        val id = item.itemId
        if (id == R.id.action_search) {

            val intent = Intent(this, MainActivity4::class.java)
            val params = Bundle()
            params.putString("resultado", resultado.toString())
            intent.putExtras(params)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}