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
        /*
        val fecha = "05/06/2001"
        var nombre: String = "Alvaro"
        var vip: Boolean = false

        var saludo = "Hola $nombre"

        println(saludo)
        //fecha = "03/02/1992" -> Los valores (val) no pueden modificarse
        */

        val a:Int = 5 + 5 //10
        val b:Int = 10 - 2 //8
        val c:Int = 3 * 4 //12
        val d:Int = 10 / 5 //2
        val e:Int = 10 % 3 //1 = Resto
        val f:Int = 10 / 6 //Division periodica, solo se mantiene parte entera 1

        var aPreIncremento: Int = 5
        var bPreDecremento: Int = 5
        var cPostIncremento: Int = 5
        var dPostDecremento: Int = 5

        println(aPreIncremento)
        println(++aPreIncremento)
        println(aPreIncremento)

        println(bPreDecremento)
        println(--bPreDecremento)
        println(bPreDecremento)

        println(cPostIncremento)
        println(cPostIncremento++)
        println(cPostIncremento)

        println(dPostDecremento)
        println(dPostDecremento--)
        println(dPostDecremento)

    }
}
