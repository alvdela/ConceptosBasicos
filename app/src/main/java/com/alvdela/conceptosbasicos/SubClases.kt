package com.alvdela.conceptosbasicos

class SubClases {
    private var name = "Padre"
    fun saludo(): String{
        return "Hola soy ${this.name}"
    }

    class Anidada{
        private val nameAnidada = "Clase Anidada"
        fun presentar(): String {return this.nameAnidada}
    }

    inner class Interna{
        private val nameInterna = "Interna"
        fun presentar(): String {return "Hola, soy ${this.nameInterna}, hija de $name"}
    }
}