package com.alvdela.conceptosbasicos

import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    private lateinit var poke: Pokemon
    object fernanda{
        var apodo = "fer"
        fun saludo(){ println("Hola, me llaman $apodo") }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var triatleta = Triatleta("Triatleta", 1.78f,76f,32,
            60,"Bici",30,"Crol",20,"100 metros")

        triatleta.correr()
        triatleta.nadar()
        triatleta.pedalear()
        triatleta.descansar()
    }
}

