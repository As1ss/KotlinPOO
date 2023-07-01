package com.example.poo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EjercicioPOO : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Creación objeto de tipo Runner
        val corredor: Runner = Runner("Pepe", 1.75f, 70f, 28)
        corredor.setEstilo("Maratón")
        corredor.setVelocidad(15f)
        corredor.correr()
        corredor.competir()

        println("--------------------------------------------------------------")

        //Creación objeto de tipo Ciclista
        val ciclista:Ciclista=Ciclista("María",1.60f,51.33f,31)
        ciclista.setTipoBici("Bicicleta de carretera")
        ciclista.setVelocidad(25f)
        ciclista.pedalear()
        ciclista.competir()

        println("--------------------------------------------------------------")

        //Creación objeto de tipo Nadador
        val nadador:Nadador= Nadador("Carles",1.85f,83.55f,29)
        nadador.setEstilo("Mariposa")
        nadador.setVelocidad(5.5f)
        nadador.nadar()
        nadador.competir()


    }
}