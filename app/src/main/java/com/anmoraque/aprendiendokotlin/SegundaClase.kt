package com.anmoraque.aprendiendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//Creo una constante para el Log
private const val TAG = "ETIQUETA_LOG"
/*
En esta actividad hemos hablado de:
    Estructuras de control (if else, when)
    Estructuras ciclicas o repetitivas (for, while, do while)
*/
class SegundaClase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_clase)
        //Aqui voy llamando a las funciones
        ciclosifElse()
        ciclosWhen()
        ciclosFor()
        ciclosWhileYDoWhile()
        suma(10,25)
        fibonacci()


    }
    /*
    If Else
    */
    fun ciclosifElse() {

        var a = 123
        var b = 11
        var c = 5
        var numeroMayor: Int

        //En kotlin la estructura if else es mas sencilla de escribir
        //En el Ej SI a>b hacemos un log y SI No hacemos el otro log
        //Tambien se puede hacer a la antigua con llaves
        //      if (a > b) {
        //      Log.d(TAG, "la a es mayor que b")
        //      } else {
        //       Log.d(TAG, "la b es mayor que a")
        //       }
        if (a > b) Log.d(TAG, "la a es mayor que b") else Log.d(TAG, "la b es mayor que a")

        //Compliquemos un poco
        // SI a>b Y a>c usamas a
        // SI b>a Y b>c usamos b
        // SI No usamos la c
        numeroMayor = if(a>b && a>c) a else if(b>a && b>c) b else c

        Log.d(TAG, "El numero mayor de todas mis variables es: $numeroMayor")

    }
    /*
    Ciclos When
    */
    fun ciclosWhen() {
        val calificacion = 3
        var resena:String
        //when se usa parecido if pero mejor estructurado, sirve para tener una serie
        //de posibilidades hacia donde seguir el curso de nuestro programa
        when(calificacion){

            //Aqui en el Ej usamos una reseña para cada calificacion
            1 -> resena = "No me gusto la comida, me causo malestar."
            2 -> resena = "No me gusto, pero la bebida si"
            3 -> resena = "Mediocre"
            4 -> resena = "Me gusto pero puede mejorar."
            5 -> resena = "La mejor comida mexicana en mucho tiempo"
            else -> resena = "Reseña mal escrita"
        }
        Log.d(TAG, "El cliente califico con $calificacion estrellas y su reseña es $resena")
    }


    /*
    Ciclos for
    */
    fun ciclosFor() {
        //El ciclo for se usa para pasar por todos los elementos de una coleccion
        //puede ser de numeros, de Strings, etc. Es decir casi siempre de un Array
        // in Sirve para itinerar en este caso del 4 al 18
        // La funcion withIndex() para saber el indice
        var arregloInt = intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)

        for((indice,valor)   in arregloInt.withIndex()) {

            Log.d(TAG, "El indice $indice representa el valor de: $valor")
        }
    }
    /*
    Ciclos while do-while
    */
    fun ciclosWhileYDoWhile() {
        //While mientras sea true lo que esta en parentesis se ejecuta el codigo
        var x = 0
            //Mientras x sea igual o menor a 10, imprimimos y sumamos 2 a la variable
            while (x<=10){

                Log.d(TAG, "El valor es $x")
                x = x + 2
            }

        var y = 1
        //Do While, la diferencia con el While es que este ciclo primero hace algo (Do),
        //es decir entra por lo menos una vez y luego se pregunta (While) mientras que
        // sea true lo que esta en parentesis se ejecuta el codigo dentro de Do
        do{
            Log.d(TAG, "Estoy adentro del do while")

        //Mientras la y sea diferente de 1
        }while(y!=1)
    }
    /*
    Introducción a funciones en Kotlin
     */
    //Una funcion usa la palabra reservada fun
    //Entre () van los datos que puede recibir, es decir los parametros
    //estos datos son los que va a procesar y utilizar dentro de la funcion.
    //En este caso dos numeros enteros (a y b)
    //Entre {} va lo que realiza la funcion, en este caso un Log que suma los dos datos
    fun suma(a:Int,b:Int){

        Log.d(TAG, "Suma = " + (a + b))
    //Las funciones se llaman usando el nombre y dando valor a los datos que lleva ()
    //en este caso seria por ej. suma(10,25)
    }

    //Si a la funcion agregamos despues de () un argumento por Ej en este caso :Int
    //podemos retornar el valor en este caso devolver un numero (la suma) para retornar
    //la funcion necesita acabar con return (retornar) en este caso return a + b
    fun suma2(a:Int,b:Int):Int{

        return a + b
        //Casi todas las funciones usan el return
    }

    /*
    Tarea: Imprimir los primeros 18 números de la serie Fibonacci
    en consola utilizando lo aprendido hasta el momento.
    Fibonacci: 0,1,1,2,3,5,8,13,21,34
    */
    fun  fibonacci(){
        var a:Int = 0
        var b:Int = 1
        var n:Int = 17 //Cuantas veces lo repito despues de a
        //Itinero desde a hasta n
        for (i in a..n){

            Log.d(TAG, "$a")//Imprimo el valor de a

            val suma = a + b
            a = b //a pasa a ser b
            b = suma //b pasa a ser la suma
        }
    }

}