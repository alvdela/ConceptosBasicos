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

        val fecha = "05/03/2001"
        var nombre: String = "Alvaro"
        var vip: Boolean = true

        var saludo = "Hola $nombre"

        val mes = fecha.subSequence(3,5).toString().toInt()
        when(mes){
            12,1,2 -> println("En Invierno no hay ofertas")
            3,4,5 -> println("En Primavera hay ofertas de inversión")
            6,7,8 -> println("En Verano regalamos una pelota de playa")
            9,10,11 -> println("En Otoño hay ofertas de prestamos")
            else -> println("Fecha introducida incorrectamente")
        }

        //fecha = "03/02/1992" -> Los valores (val) no pueden modificarse

        if(vip){
            saludo += ", eres VIP"
        }else{
            saludo += ", paga la cuota"
        }
        println(saludo)

        var pin:Int = 1234
        var intentos:Int = 0

        var claveIngresada:Int = 1230

        do {
            println("Ingrese el Pin: ")
            println("Clave ingresada: ${claveIngresada++}")
            intentos++
        }while (intentos < 3 && claveIngresada!=pin)
        if (intentos == 3) println("Tarjeta bloqueada")

        /*
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
        */

    }
}
