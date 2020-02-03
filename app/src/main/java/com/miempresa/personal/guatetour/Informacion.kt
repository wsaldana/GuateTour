package com.miempresa.personal.guatetour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.miempresa.personal.guatetour.databinding.ActivityInformacionBinding

class Informacion : AppCompatActivity() {

    lateinit var entrada: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
        entrada = findViewById(R.id.editText2)
        val binding: ActivityInformacionBinding = DataBindingUtil.setContentView(this, R.layout.activity_informacion)

        val bundle: Bundle ?=intent.extras
        val key: String? = bundle?.getString("nombre")

        var titulo: String = when(key){
            "tikal"->getString(R.string.titulo_tikal)
            "antigua"->getString(R.string.titulo_antigua)
            "xela"->getString(R.string.titulo_xela)
            else -> getString(R.string.titulo_tikal)
        }

        var frase: String = when(key){
            "tikal"->getString(R.string.frase_tikal)
            "antigua"->getString(R.string.frase_antigua)
            "xela"->getString(R.string.frase_xela)
            else->getString(R.string.frase_tikal)
        }

        var descr: String = when(key){
            "tikal"->getString(R.string.tikal)
            "antigua"->getString(R.string.antigua)
            "xela"->getString(R.string.xela)
            else->getString(R.string.tikal)
        }

        var modelo = Modelo()
        modelo.title = titulo
        modelo.phrase = frase
        modelo.description = descr

        binding.modelo=modelo
    }

    fun comentar(view: View) {
        val ventana = Intent(this, MainActivity::class.java)
        ventana.putExtra("msm",entrada.text.toString())
        startActivity(ventana)
    }
}
