package com.alvdela.conceptosbasicos

open class Person(var name:String = "Anonimo", var passport: String? = null, var height: Float = 1.60f){

    var alive: Boolean = true

    fun die(){
        alive = false
    }

/*    fun checkPolicia(fn: (Float)->Boolean): Boolean{
        return fn(height)
    }*/
}