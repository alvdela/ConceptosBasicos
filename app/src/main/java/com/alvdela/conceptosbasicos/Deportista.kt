package com.alvdela.conceptosbasicos

open class Deportista(
    protected var nombre: String,
    protected var estatura: Float,
    protected var peso: Float,
    protected var edad: Int
) {
    internal fun descansar() {
        println("Estoy descansando")
    }
}

interface Runner {
    var estiloCorrer: String
    var velocidadCorrer: Int

    fun correr() {
        println("Estoy corriendo en el estilo: $estiloCorrer, a una velocidad de $velocidadCorrer")
    }
}

interface Ciclista {
    var tipoBici: String
    var velocidadPedalear: Int

    fun pedalear() {
        println("Estoy pedaleando en una bici: $tipoBici, a una velocidad de $velocidadPedalear")
    }
}

interface Nadador {
    var estiloNadar: String
    var velocidadNadar: Int

    fun nadar() {
        println("Estoy nadando con el estilo: $estiloNadar, a una velocidad de $velocidadNadar")
    }
}

class RunnerImpl(
    nombre: String, estatura: Float, peso: Float, edad: Int,
    override var estiloCorrer: String,
    override var velocidadCorrer: Int
) :
    Deportista(nombre, estatura, peso, edad), Runner {
    override fun correr() {
        super.correr()
    }

    fun competir(){
        println("voy a correr!!!")
    }
}

class NadadorImpl(
    nombre: String, estatura: Float, peso: Float, edad: Int,
    override var estiloNadar: String,
    override var velocidadNadar: Int
) :
    Deportista(nombre, estatura, peso, edad), Nadador {
    override fun nadar() {
        super.nadar()
    }

    fun competir(){
        println("voy a nadar!!!")
    }
}

class CiclistaImpl(
    nombre: String, estatura: Float, peso: Float, edad: Int,
    override var tipoBici: String,
    override var velocidadPedalear: Int
) :
    Deportista(nombre, estatura, peso, edad), Ciclista {
    override fun pedalear() {
        super.pedalear()
    }

    fun competir(){
        println("voy a pedalear!!!")
    }
}

class Triatleta(
    nombre: String, estatura: Float, peso: Float, edad: Int,
    override var velocidadPedalear: Int,
    override var tipoBici: String,
    override var velocidadCorrer: Int,
    override var estiloNadar: String,
    override var velocidadNadar: Int,
    override var estiloCorrer: String
    )
    :Deportista(nombre, estatura, peso, edad),Runner,Nadador,Ciclista{
    override fun nadar() {
        super.nadar()
    }

    override fun pedalear() {
        super.pedalear()
    }

    override fun correr() {
        super.correr()
    }
}