package com.alvdela.conceptosbasicos

import android.os.Bundle
import androidx.activity.ComponentActivity

//Alias para simplificar, utilidad cuestionable
typealias  aliasDato = MutableMap<Int, ArrayList<String>>
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

    private fun ejercicio(num: Int, fn: (Int)->Boolean): Boolean{
        return fn(num)
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

        var suma = 0
        recorrerArray(array2){
            suma += it
        }
        println("La suma de los elementos del array es: $suma")

        var sol: Star = Star("Sol", 69340f, "Vía lactea")
        println("Datos de la galaxia: ${sol.component3()}")
        var(nameStar,radiusStar,galaxy) = Star("Sol2", 693400f, "Vía lactea2")
        //Guion bajo para saltarse un parametro
        var(nameStar2,_,galaxy2) = Star("Sol2", 693400f, "Vía lactea2")

        var saludos: aliasDato = mutableMapOf()
        saludos[0] = arrayListOf("Hola","Adios")
        saludos[1] = arrayListOf("Hi", "Bye")

        for((id,palabras) in saludos){
            println("$id, $palabras")
        }

        try{
            println("División /0: ${5/0}")
        }catch (e: Exception){
            println("Manejando el error")
        }finally {
            println("Pase lo que pase se ejecuta")
        }

        //Operador elvis
        var pais: String? = "Rusia"
        pais = pais?.uppercase() ?: "DESCONOCIDO"

        var pais2: String? = null
        pais2 = pais2?.uppercase() ?: "DESCONOCIDO"


        println("El numero 4 es par?: ${ejercicio(4) { num: Int -> (num % 2) == 0 }}")
        println("El numero 5 es par?: ${ejercicio(5) { num: Int -> (num % 2) == 0 }}")
        println("El numero 4 es primo?: ${ejercicio(4,::esPrimo)}")
        println("El numero 7 es primo?: ${ejercicio(7,::esPrimo)}")
        println("El numero 10 es guay?: ${ejercicio(10,::esGuay)}")
        println("El numero 8 es guay?: ${ejercicio(8,::esGuay)}")

    }

    //Unit si la función es void
    private fun recorrerArray(array : IntArray, fn: (Int) -> Unit){
        for(i in array){
            fn(i)
        }
    }

    private fun valueTry(a: Int, b: Int): Any{
        var res =
            try{
                println("División: $a/$b")
                a/b
            }catch (e: Exception){
                println("Manejando el error")
                "División no permitida"
            }
        return res
    }

    private fun esPrimo(num: Int): Boolean{
        if(num == 0 || num == 1 ){
            return true
        }
        for(i in 2..<num){
            if(num % i == 0){
                return false
            }
        }
        return true
    }

    private fun esGuay(num: Int): Boolean{
        var cont: Int = 1
        var suma: Int = 0
        while(suma < num){
            suma+=cont
            cont++
        }
        return suma == num
    }
}

