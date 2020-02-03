package com.miempresa.personal.guatetour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.miempresa.personal.guatetour.databinding.ActivityInformacionBinding

class Informacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
        val binding: ActivityInformacionBinding = DataBindingUtil.setContentView(this, R.layout.activity_informacion)

        //val key:String = intent.getStringExtra("nombre")
        val bundle: Bundle ?=intent.extras
        val key: String? = bundle?.getString("nombre")

        var titulo: String = when(key){
            "tikal"->R.string.titulo_tikal
            "antigua"->R.string.titulo_antigua
            "xela"->R.string.titulo_xela
        }

        var frase: String = when(key){
            "tikal"->R.string.frase_tikal
            "antigua"->R.string.frase_antigua
            "xela"->R.string.frase_xela
        }

        var descr: String = when(key){
            "tikal"->R.string.tikal
            "antigua"->R.string.antigua
            "xela"->R.string.xela
        }

        var modelo = Modelo()
        modelo.title = titulo
        modelo.phrase = frase
        modelo.description = descr
    }
}
