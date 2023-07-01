package com.example.poo

class Ciclista(
    nombre: String? = null,
    estatura: Float? = null,
    peso: Float? = null,
    edad: Int? = null
) :
    Deportista(nombre, estatura, peso, edad) {


    private var tipoBici: String? = null
    private var velocidad: Float? = null

    fun pedalear(){
        super.mostrarFicha()
        println("Tipo de bici: ${this.tipoBici}")
        println("Velocidad: ${this.velocidad}km/h")
    }
    override fun competir(){
        println("Voy a pedalear!")
    }


    fun getTipoBici(): String? {
        return this.tipoBici
    }

    fun setTipoBici(tipo: String?) {
        this.tipoBici = tipo
    }
    fun getVelocidad():Float?{
        return this.velocidad
    }
    fun setVelocidad(speed:Float?){
        this.velocidad=speed
    }

}