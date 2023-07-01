package com.example.poo

enum class Days(val laboral: Boolean, val jornada: Int) {
    LUNES(true, 8), MARTES(true, 8), MIERCOLES(true, 5),
    JUEVES(true, 8), VIERNES(true, 5), SABADO(false, 0),
    DOMINGO(false, 0);

    fun saludo(): String {
        when (this) {
            LUNES -> return "Hola, hoy lunáticox"

            MARTES -> return "Hola, hoy martirio eterno"


            MIERCOLES -> return "Hola, hoy dia de mierrcoles"


            JUEVES -> return "Hola, hoy es veves"


            VIERNES -> return "Hola,hoy al final viernes o no?"
            else
            -> return "Hola, hoy toca chilleo"

        }
    }
}