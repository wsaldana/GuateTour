package com.miempresa.personal.guatetour

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ventanaTikal(){
        val ventana = Intent(this, Informacion::class.java)
        ventana.putExtra("nombre","tikal")
        startActivity(ventana)
    }

    fun ventanaAntigua(){
        val ventana = Intent(this, Informacion::class.java)
        ventana.putExtra("nombre","antigua")
        startActivity(ventana)
    }

    fun ventanaXela(){
        val ventana = Intent(this, Informacion::class.java)
        ventana.putExtra("nombre","xela")
        startActivity(ventana)
    }

}
