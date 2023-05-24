package com.example.testando

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setSupportActionBar(findViewById(R.id.toolbar2))

        val textView = findViewById<TextView>(R.id.textViewLogin)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val args = intent.extras
        val nome = args?.getString("nome")
        textView.text = "bem-vindo $nome"

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        menu.setGroupVisible(R.id.segunda_tela, false)
        menu.setGroupVisible(R.id.excluir, false)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.action_refresh) {

            val intent = Intent(this, MainActivity3::class.java)
            val params = Bundle()
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}