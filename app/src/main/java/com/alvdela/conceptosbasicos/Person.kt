package com.alvdela.conceptosbasicos

open class Person(var name:String = "Anonimo", var passport: String? = null): Thanks(){

    var alive: Boolean = true

    fun Person(){
        name = "Alberto"
        passport = "A45756321"
    }

    fun die(){
        alive = false
    }
}