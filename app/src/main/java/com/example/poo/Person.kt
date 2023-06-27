package com.example.poo

class Person(var name: String = "Anonimo", var passport: String? = null) {
    var alive: Boolean = true


    fun Person(){
        name="Juan"
        passport="B481290"
    }
    fun die() {
        alive = false
    }

}