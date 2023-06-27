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

        println("OBJETOS TIPO PERSONA--------------------")
        println("Nombre: ${persona.getName()}")
        println("Pasaporte: ${persona.getPassport()}")
        println("Esta ${persona.getName()} vivo? ${persona.getAlive()}")
        persona.die()
        println("Nombre: ${persona.getName()}")
        println("Pasaporte: ${persona.getPassport()}")
        println("Esta ${persona.getName()} vivo? ${persona.getAlive()}")


        println("Nombre: ${persona2.getName()}")
        println("Pasaporte: ${persona2.getPassport()}")
        println("Esta ${persona2.getName()} vivo? ${persona2.getAlive()}")
        persona2.die()
        println("Nombre: ${persona2.getName()}")
        println("Pasaporte: ${persona2.getPassport()}")
        println("Esta ${persona2.getName()} vivo? ${persona2.getAlive()}")


        //Asignación de otros atributos mediante un método en la clase
        persona2.Person()
        println("Nombre: ${persona2.getName()}")
        println("Pasaporte: ${persona2.getPassport()}")
        println("Esta ${persona2.getName()} vivo? ${persona2.getAlive()}")
        persona2.die()
        println("Nombre: ${persona2.getName()}")
        println("Pasaporte: ${persona2.getPassport()}")
        println("Esta ${persona2.getName()} vivo? ${persona2.getAlive()}")

        println("OBJETOS TIPO ATLETA, HEREDADO DE PERSONA------------------")
        var atleta: Athlete = Athlete("Pepe", "1923912", "Natación")

        println("Nombre del atleta: ${atleta.getName()}")
        println("Pasaporte del atleta: ${atleta.getPassport()}")
        println("Deporte del atleta: ${atleta.sport}")
        println("Está vivo? : ${atleta.getAlive()}")




        println("OBJETOS TIPO POKEMON----------------------------")
        var pokemon: Pokemon = Pokemon()
        pokemon.setName("PokemonSetteado")
        println("Nombre del Pokemon; ${pokemon.getName()}")
        pokemon.setAttackPower(66f)
        println("Poder de ataque: ${pokemon.getAttackPower()}")
        pokemon.setLife(120f)
        println("Puntos de vida: ${pokemon.getLife()}")

        var pokemonAqua: WaterPokemon = WaterPokemon()
        pokemonAqua.setName("Squirtle")
        println("Nombre del Pokemon: ${pokemonAqua.getName()}")
        pokemonAqua.setAttackPower(50f)
        println("Poder de ataque: ${pokemonAqua.getAttackPower()}")
        pokemonAqua.setLife(55f)
        println("Puntos de vida: ${pokemonAqua.getLife()}")
        pokemonAqua.cure()
        println("Puntos de vida: ${pokemonAqua.getLife()}")
        pokemonAqua.sayHi()
        pokemonAqua.immerse()
        pokemonAqua.setMaxResistance(100)
        println("Respiración restante: ${pokemonAqua.getMaxResistance() - pokemonAqua.getSubmergedTime()}/ ${pokemonAqua.getMaxResistance()} ")
        pokemonAqua.breathe()
        println("Respiración restante: ${pokemonAqua.getMaxResistance() - pokemonAqua.getSubmergedTime()}/ ${pokemonAqua.getMaxResistance()} ")
        pokemonAqua.attack()

        //Ahora vamos a evolucionarlo
        pokemonAqua.evolve("Wartortle")

        println("El pokemon ha evolucionado a ${pokemonAqua.getName()}")
        println("Nombre del Pokemon; ${pokemonAqua.getName()}")
        println("Poder de ataque: ${pokemonAqua.getAttackPower()}")
        println("Puntos de vida: ${pokemonAqua.getLife()}")
        pokemonAqua.attack()

    }
}