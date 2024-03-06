package com.alvdela.conceptosbasicos

import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    private lateinit var poke: Pokemon
    object fernanda{
        var apodo = "fer"
        fun saludo(){ println("Hola, me llaman $apodo") }
    }

    //Función de extensión
    private fun String.noSpaces(): String{
        return this.replace(" ", "")
    }

    //Funciones de orden superior
    private fun calculadora(n1: Int, n2: Int, fn: (Int, Int)->Int): Int{
        return fn(n1,n2)
    }

    private fun suma(x: Int, y: Int): Int{
        return x+y
    }

    private fun resta(x: Int, y: Int): Int{
        return x-y
    }

    //Interesante esto
    private fun multiplica(x: Int, y: Int) = x*y
    private fun divide(x: Int, y: Int) = x/y

    private fun inColombia(h: Float): Boolean{
        return h >= 1.6f
    }

    private fun inSpain(h: Float): Boolean{
        return h >= 1.65f
    }

    //Esto esta mal, la clase la hemos creado nosotros
    private fun Person.checkPolicia(fn: (Float)->Boolean): Boolean{
        return fn(height)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuario = "   soy  yo  "

        println("aaa")
        println("$usuario (${usuario.length}) - ${usuario.noSpaces()} (${usuario.noSpaces().length})")

        var alv: Person = Person("Alvaro",null,1.75f)
        println(alv.checkPolicia(::inSpain))

        var fer: Person = Person("Fer",null,1.60f)
        println(fer.checkPolicia(::inColombia))
        println(fer.checkPolicia(::inSpain))

        //Lambdas son esto: ...pero anonimas
        var funcion = {x: Int, y: Int -> x + y}
        println("La suma de 80 y 20 con variable es ${calculadora(80,20, funcion)}")
        //Ejemplo de lambdas
        println("La suma de 80 y 20 con variable es ${calculadora(80,20) { x: Int, y: Int -> x + y }}")
        println("La resta de 80 y 20 con variable es ${calculadora(80,20) { x: Int, y: Int -> x - y }}")
        println("La potencia de 2 elevado a 5 con lambda es ${calculadora(2,5) { x, y ->
            var valor = 1
            for (i in 1..y) valor *= x
            valor
        }
        }")

        var array = IntArray(10) {5}
        //Recibe un iterador y lo modificamos
        var array2 = IntArray(10) {i -> i*3}
    }
}

