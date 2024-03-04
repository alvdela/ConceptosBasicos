package com.alvdela.conceptosbasicos

class Pokemon(private var name:String = "Poke",
              private var attackPower: Float = 30f,
              private var life: Float = 100f){
    fun getName(): String{
        return this.name
    }

    fun getPower(): Float{
        return this.attackPower
    }

    fun getLife(): Float{
        return this.life
    }

    fun setName(n: String){
        this.name = n
    }

    fun setPower(power: Float){
        this.attackPower = power
    }

    fun setLife(life: Float){
        this.life = life
    }

}