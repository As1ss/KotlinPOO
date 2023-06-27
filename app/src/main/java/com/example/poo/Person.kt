package com.example.poo

//La clausula "open" sirve para que otras clases puedan heredar de dicha  clase
open class Person(private var name: String = "Anonimo", private var passport: String? = null) {
    private var alive: Boolean = true


    fun Person() {
        name = "Juan"
        passport = "B481290"
    }

    fun die() {
        alive = false
    }

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getPassport(): String? {
        return this.passport
    }

    fun setPassport(passport: String?) {
        this.passport = passport
    }
    fun getAlive():Boolean{
        return this.alive
    }
    fun setAlive(alive:Boolean){
        this.alive=alive
    }

}

class Athlete(name: String, passport: String?, var sport: String?) : Person(name, passport) {


}