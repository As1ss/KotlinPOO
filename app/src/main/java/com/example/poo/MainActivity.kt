package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Creación de un objeto pasandole los parametros
        var persona: Person = Person("Alexis", "12345678-A")
        //Creación de un objeto con parametros inicializados por defecto en el constructor
        var persona2: Person = Person()


        println("Nombre: ${persona.name}")
        println("Pasaporte: ${persona.passport}")
        println("Esta ${persona.name} vivo? ${persona.alive}")
        persona.die()
        println("Nombre: ${persona.name}")
        println("Pasaporte: ${persona.passport}")
        println("Esta ${persona.name} vivo? ${persona.alive}")


        println("Nombre: ${persona2.name}")
        println("Pasaporte: ${persona2.passport}")
        println("Esta ${persona2.name} vivo? ${persona2.alive}")
        persona2.die()
        println("Nombre: ${persona2.name}")
        println("Pasaporte: ${persona2.passport}")
        println("Esta ${persona2.name} vivo? ${persona2.alive}")


        //Asignación de otros atributos mediante un método en la clase
        persona2.Person()
        println("Nombre: ${persona2.name}")
        println("Pasaporte: ${persona2.passport}")
        println("Esta ${persona2.name} vivo? ${persona2.alive}")
        persona2.die()
        println("Nombre: ${persona2.name}")
        println("Pasaporte: ${persona2.passport}")
        println("Esta ${persona2.name} vivo? ${persona2.alive}")


        var pokemon: Pokemon = Pokemon()
        pokemon.setName("PokemonSetteado")
        println("Nombre del Pokemon; ${pokemon.getName()}")
        pokemon.setAttackPower(66f)
        println("Poder de ataque: ${pokemon.getAttackPower()}")
        pokemon.setLife(120f)
        println("Puntos de vida: ${pokemon.getLife()}")


    }
}