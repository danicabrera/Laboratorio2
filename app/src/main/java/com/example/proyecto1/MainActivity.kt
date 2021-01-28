package com.example.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()
        //sentenciaIf()
        //sentenciaWhen()
        arrays()
        maps()
        loops()


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

    private fun arrays() {
        val nombre = "Daniel"
        val apellido = "Cabrera"
        val ciudad = "Guatemala"
        val universidad = "Del Valle de Guatemala"


        val myArray:ArrayList<String> = arrayListOf<String>()
        //Agregar Datos
        myArray.add(nombre)
        myArray.add(apellido)
        myArray.add(ciudad)
        myArray.add(universidad)

        println(myArray)

        //Agregar conjunto de datos

        myArray.addAll(listOf("Campus Uvg", "El pepe"))
        println(myArray)

        //Acceso a Datos
        val myCompany:String = myArray[2]
        println(myCompany)

        //Modificar datos
        myArray[2] = "Solo del Valle"


        //eliminar datos
        myArray.removeAt(2)
        println(myArray)

        //Recorrer el Array
        myArray.forEach(){
            //println()
        }

    }

    fun maps(){
        var myMap : Map<String, Int> = mapOf()
        println(myMap)

        //agregar datos

        myMap   = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3, "cuatro" to 4)
        println(myMap)

        //agregar dato 1
        myMap["cinco"] = 5
        myMap["seis"] = 6

        println(myMap)

        myMap.put("siete", 7)
        println(myMap)

        //Acceso a datos
        println(myMap["seis"])

        //eliminar los datos
        myMap.remove("seis")
        println(myMap)

    }

    fun loops(){
        //For
        val myArray: List<String> = listOf("Daniel", "Cabrera", "Guatemala", "Del valle de guatemala")
        val myMap: MutableMap<String, Int> = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3, "cuatro" to 4)
        for(myString: String in myArray){
            println(myString)
        }

        for(myElement:MutableMap.MutableEntry<String, Int> in myMap){
            println("${myElement.key} - ${myElement.value}")
        }

        
        //While
    }
