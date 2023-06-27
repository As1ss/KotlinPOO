package com.example.poo

class Pokemon(
    private var name: String = "Pokemone",
    private var attackPower: Float = 30f,
    private var life: Float = 100f
) {


    //Esta función es para acceder a los datos de forma abreviada? (life)
    fun Pokemon(n: String, aP: Float) {
        this.name = n
        this.attackPower = aP
        life = 100f
    }


    fun getName(): String {
        return this.name
    }

    fun getAttackPower(): Float {
        return this.attackPower
    }

    fun getLife(): Float {
        return this.life
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setAttackPower(attackPower: Float) {
        this.attackPower = attackPower
    }

    fun setLife(life: Float) {
        this.life = life
    }
}