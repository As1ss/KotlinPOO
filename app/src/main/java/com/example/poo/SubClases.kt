package com.example.poo

class SubClasses {
    private var namePadre: String = "Padre"
    fun presentacion(): String {
        return this.namePadre
    }
    class Anidada{
        private var nameAnidada:String="Anidada"
        fun presentacion():String{
            return this.nameAnidada
        }
    }
   inner  class Interna{
        private var nameInterna:String="Interna"
        fun presentacion():String{
            return "Hola soy ${this.nameInterna} hija de ${namePadre}"
        }
    }


}