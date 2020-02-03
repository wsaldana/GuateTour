package com.miempresa.personal.guatetour

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var nombre: TextView
    lateinit var label: TextView
    lateinit var entrada: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.textView3)
        label = findViewById(R.id.textView2)
        entrada = findViewById(R.id.editText)

        //val bundle: Bundle ?=intent.extras
        //val key: String? = bundle?.getString("msm")
        val key: String? = intent.getStringExtra("msm")

        if(key.equals("")){
            Toast.makeText(this, "Sin comentarios...", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, key, Toast.LENGTH_SHORT).show()
        }
    }

    fun ventanaTikal(view: View){
        val ventana = Intent(this, Informacion::class.java)
        ventana.putExtra("nombre","tikal")
        startActivity(ventana)
    }

    fun ventanaAntigua(view: View){
        val ventana = Intent(this, Informacion::class.java)
        ventana.putExtra("nombre","antigua")
        startActivity(ventana)
    }

    fun ventanaXela(view: View){
        val ventana = Intent(this, Informacion::class.java)
        ventana.putExtra("nombre","xela")
        startActivity(ventana)
    }

    fun editarNombre(view: View){
        if (nombre.isVisible) {
            entrada.visibility = View.VISIBLE
            label.visibility = View.VISIBLE
            nombre.visibility = View.INVISIBLE
        } else {
            entrada.visibility = View.INVISIBLE
            label.visibility = View.INVISIBLE
            nombre.text = entrada.text
            nombre.visibility = View.VISIBLE
        }
    }

}
