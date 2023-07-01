package com.example.poo

abstract class Deportista(
    protected var nombre: String? = null,
    protected var estatura: Float? = null,
    protected var peso: Float? = null,
    protected var edad: Int? = null
) {


    fun mostrarFicha(){
        println("Nombre: ${this.nombre}")
        println("Estatura: ${this.estatura}cm")
        println("Peso: ${this.peso}kg")
        println("Edad: ${this.edad}")
    }
    fun descansar() {
        println("${this.nombre} está descansando")
    }
    open fun competir(){

    }


}