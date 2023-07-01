package com.example.poo

class Runner(
    nombre: String? = null,
    estatura: Float? = null,
    peso: Float? = null,
    edad: Int? = null
) :
    Deportista(nombre, estatura, peso, edad) {
    private var estilo: String? = null
    private var velocidad: Float? = null

    fun correr() {
        super.mostrarFicha()
        println("Estilo: ${this.estilo}")
        println("Velocidad: ${this.velocidad}/h")
    }
    override fun competir(){
        println("Voy a correr!")
    }

    fun getEstilo(): String? {
        return this.estilo
    }

    fun setEstilo(style: String?) {
        this.estilo = style
    }

    fun getVelocidad(): Float? {
        return this.velocidad
    }

    fun setVelocidad(speed: Float?) {
        this.velocidad = speed
    }

}