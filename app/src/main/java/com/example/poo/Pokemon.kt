package com.example.poo

open class Pokemon(
    protected var name: String = "Pokemone",
    protected var attackPower: Float = 30f,
    protected var life: Float = 100f
) {


    //Esta función es como un constructor falso
    fun Pokemon(n: String, aP: Float) {
        this.name = n
        this.attackPower = aP
        life = 100f
        this.sayHi()
    }

    fun sayHi() {
        println("Hola soy $name!! $name!! $name!!")
    }

    fun evolve(newName: String) {
        this.name = newName
        this.attackPower *= 1.20f
        this.sayHi()
    }

    fun cure() {
        this.life = 100f
    }

    fun attack() {
        println("${this.name} ha atacado!")
    }

    internal fun getName(): String {
        return this.name
    }

    internal fun getAttackPower(): Float {
        return this.attackPower
    }

    internal fun getLife(): Float {
        return this.life
    }

    internal fun setName(name: String) {
        this.name = name
    }

    internal fun setAttackPower(attackPower: Float) {
        this.attackPower = attackPower
    }

    internal fun setLife(life: Float) {
        this.life = life
    }


}

class WaterPokemon(
    name: String = "Pokemone",
    attackPower: Float = 30f,
    private var maxResistance: Int = 500
) :
    Pokemon(name, attackPower) {

    private var submergedTime: Int = 0

    //Constructor falso , para poder acceder a los atributos de la clase padre debemos
    // encapsularlos bajo la clausula protected y no private
    // añadiendo la clausula "internal" en todos los getters y setters de la clase padre
    fun WaterPokemon(n: String, aP: Float, mR: Int) {
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.maxResistance = mR
        this.sayHi()
    }

    fun breathe() {
        this.submergedTime = 0
    }

    fun immerse() {
        this.submergedTime++
    }

    fun getMaxResistance(): Int {
        return this.maxResistance
    }

    fun setMaxResistance(cantidad: Int) {
        this.maxResistance = cantidad
    }

    fun getSubmergedTime(): Int {
        return this.submergedTime
    }

    fun setSubmergedTime(cantidad: Int) {
        this.submergedTime = cantidad
    }

}
