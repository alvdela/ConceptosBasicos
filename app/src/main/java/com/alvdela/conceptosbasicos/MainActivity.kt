package com.alvdela.conceptosbasicos

import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    companion object{
        //Ambido distinto a la creación de la ventana
        const val moneda = "EUR"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "05/06/2001"
        var nombre = "Alvaro"

        println(nombre)
        //fecha = "03/02/1992" -> Los valores (val) no pueden modificarse

    }
}
