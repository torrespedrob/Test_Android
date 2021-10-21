package com.ptb.test_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Hola mundo", "esto es un primer mensaje en consola")

        val texto:TextView = findViewById(R.id.texto)
        texto.setText("¡Bienvenidos a Android con Kotlin!")


        val boton:Button = findViewById(R.id.boton)
        boton.setOnClickListener{
            texto.setText("Has pulsado el boton")
        }

    }
}