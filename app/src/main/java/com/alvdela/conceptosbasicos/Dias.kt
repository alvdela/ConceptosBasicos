package com.alvdela.conceptosbasicos

enum class Dias (val laboral: Boolean, val jornada: Int){
    LUNES(true,8), MARTES(true,8), MIERCOLES(true,8),
    JUEVES(true,8), VIERNES(true,8), SABADO(false,0),
    DOMINGO(false,0);

    fun saludo(): String{
        return when(this){
            LUNES-> "empezando con alegría"
            MARTES -> "queda menos"
            MIERCOLES -> "los mercoles son los días más productivos"
            JUEVES -> "ya queda menos"
            VIERNES -> "fiesta"
            else -> "a quemar el finde"
        }
    }
}