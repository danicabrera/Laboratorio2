package com.example.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
        sentenciaIf()
        sentenciaWhen()
    }

    // Variables y Constantes



}

    private fun variablesYConstantes(){
        //Variables

        var myFirstVariable = "Esta es una prueba"
        var myFirstNumber = 10000
        var mySecondVariable = "Segunda prueba para ver si funciona"

        val myFirstConstant = "Continuamos con la pruebas"


        println(mySecondVariable)
        println(myFirstConstant)

        val myString3 = myFirstVariable + " " + mySecondVariable

            println(myString3)
        //Enteros

        val myInt = 100
        val myInt2 = 200
        val myInt3 = myInt + myInt2

        println(myInt3)

        //Decimales Float

        val myFloat = 100.5
        val myFloat2 = 199.5
        val myInt10 = 10
        val myFloat3 = myFloat + myFloat2 + myInt10

        println(myFloat3)


    }
// Operador condicionales <> <= >= == !=
    private fun sentenciaIf(){
        val myNumber = 11
        if(myNumber <= 10){
            println("$myNumber es menor o igual a 10")
        } else {
            println("$myNumber es mayor que 10")
        }
    }

    //Operadores lógicos Y && O // \\?

    private fun sentenciaWhen(){
        var Country = "USA"

        when(Country){
            "Guatemala" -> {
                println("Se habla español")
            } "Francia" -> {
                println("Se habla francés")
            } "Nicaragua" -> {
                println("El idioma es Español")
            } "USA" ->{
                println("El idioma es inglés")
            } else ->{
                println("No conocemos el idioma")
        }
        }
    }