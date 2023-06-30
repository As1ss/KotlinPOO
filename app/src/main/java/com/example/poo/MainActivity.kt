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

        println("OBJETOS TIPO AGUA-------------------------------")
        var pokemonAqua: WaterPokemon = WaterPokemon()
        pokemonAqua.setName("Squirtle")
        println("Nombre del Pokemon: ${pokemonAqua.getName()}")
        pokemonAqua.setAttackPower(30f)
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

        println("OBJETOS TIPO TIERRA-----------------")
        var pokemonTierra: EarthPokemon = EarthPokemon("Dugtrio", 25f)
        pokemonTierra.depth
        pokemonTierra.attack()
        pokemonTierra.sayByeEarthPokemon()

        println("OBJETOS TIPO FUEGO-------------------------------")
        var pokemonFire: FirePokemon = FirePokemon("Charmander", 30f)
        pokemonFire.attack()

        println("COMBATE DE POKEMONES-------------------------------")
        fight(pokemonFire, pokemonTierra)
    }

    private fun fight(p1: Pokemon, p2: Pokemon) {

        var text = ""

        text += "\n ${p1.getName()} ${p1.getLife()} VS ${p2.getName()} ${p2.getLife()}"


        while (p1.getLife() > 0 && p2.getLife() > 0) {
            text += "\n ${p1.getName()} ataca!"
            p1.attack()
            p2.setLife(p2.getLife() - p1.getAttackPower())
            text += "\n ${p1.getName()} ${p1.getLife()} VS ${p2.getName()} ${p2.getLife()}"
            if (p2.getLife() > 0) {
                text += "\n ${p2.getName()} ataca!"
                p2.attack()
                p1.setLife(p1.getLife() - p2.getAttackPower())
                text += "\n ${p1.getName()} ${p1.getLife()} VS ${p2.getName()} ${p2.getLife()}"
            }
        }
        if (p1.getLife() > 0) {
            text += "\n\nEL CAMPEON ES ${p1.getName()}"
        } else {
            text += "\n\nEL CAMPEON ES ${p2.getName()}"
        }
        println(text)


        //Clases Padre, y clases anidadas/internas (las clases hijas no heredan del padre)

        var subClasesTest: SubClasses = SubClasses()
        println(subClasesTest.presentacion())
        var anidadasTest: SubClasses.Anidada = SubClasses.Anidada()
        println(anidadasTest.presentacion())
        var internaTest:SubClasses.Interna= SubClasses().Interna()
        println(internaTest.presentacion())

    }


}