package com.alvdela.conceptosbasicos

open class Pokemon(protected var name:String = "Poke",
                   protected var attackPower: Float = 30f,
                   protected var life: Float = 100f): Thanks(), SayBye{
    internal fun getName(): String{
        return this.name
    }

    internal fun getPower(): Float{
        return this.attackPower
    }

    internal fun getLife(): Float{
        return this.life
    }

    internal fun setName(n: String){
        this.name = n
    }

    internal fun setPower(power: Float){
        this.attackPower = power
    }

    internal fun setLife(life: Float){
        this.life = life
    }

    fun cure(){
        this.setLife(100f)
        thanksCure()
    }

    open fun attack(){
        println("Al ataqueeee!")
    }
}

class WaterPokemon(n:String = "Pok", ap:Float = 30f, l:Float = 100f): Pokemon(n,ap,l){

    private var maxResistance: Int = 500
    private var submergedTime: Int = 0

    fun breathe(){ this.submergedTime = 0}
    fun immerse(){this.submergedTime++}

    override fun attack(){
        super.attack()
        println("Pistola agua")
    }
}

class FirePokemon(n:String = "Pok", ap:Float = 30f, l:Float = 100f): Pokemon(n,ap,l){

    private var ballTemperature: Int = 90
    lateinit var ball: FireBall

    override fun attack(){
        super.attack()
        ball = FireBall(ballTemperature)
        ball.throwBall()
    }
}

abstract class Thanks(){
    fun thanksCure(){
        println("Gracias por curarme")
    }
}

interface SayBye{
    fun sayBye(){
        println("Adios")
    }
}

class FireBall(var temp: Int = 100){
    fun throwBall(){
        println("Tirando bola de fuego con temperatura: $temp")
    }
}