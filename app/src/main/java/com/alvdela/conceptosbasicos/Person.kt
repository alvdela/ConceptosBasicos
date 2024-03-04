package com.alvdela.conceptosbasicos

class Person(var name:String = "Anonimo", var passport: String? = null) {

    var alive: Boolean = true

    fun Person(){
        name = "Alberto"
        passport = "A45756321"
    }

    fun die(){
        alive = false
    }
}