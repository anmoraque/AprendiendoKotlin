package com.anmoraque.aprendiendokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
//Creo una constante para el Log
private const val TAG = "ETIQUETA_LOG"

/*
En esta actividad hemos hablado de:
    Constantes y Variables
    Tipos de Datos (Numericos, Strings, Arrays, Any)
    Tipos de Operadores (Aritmeticos, de comparacion y logicos)
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Aqui voy llamando a las funciones
        variablesYConstantes()
        datosNumericos()
        datosString()
        strings()
        arrays()
        any()
        operadores()
    }

    /*
       Programa de variables y contantes
    */
    fun variablesYConstantes() {

        var edadFirulais = 18
        //Las variables se pueden modificar
        edadFirulais = 15

        //Las constantes no se pueden modificar
        val nombreFirulais = "Pinky Firulais"

        //Con Log.d podemos ver en el Logcat
        Log.d(TAG, "Nombre y edad del perro = " + nombreFirulais + " " + edadFirulais)
    }

    /*
    Tipos de Datos:
    Tipos Numericos  Bit ancho
    Double              64
    Float               32
    Long                64
    Int                 32
    Short               16
    Byte                 8

    Characters , Strings , Arrays , Booleans
    */

    /*
   Tipos de Datos: Numericos
   */
    fun datosNumericos() {

        //En Kotlin no hace falta especificar el tipo numerico
        var numero = 18

        //Pero si quieres lo puedes hacer (Por ej para diferenciar Double y Float)
        //Esta es una forma F = Float
        var numero2 = 18.5F

        //Esta es otra forma :Double en el nombre de la variante
        var numero3:Double = 19.4

        Log.d(TAG, "Tipos de numeros = " + numero + " " + numero2+ " " + numero3)
    }

    /*
    Tipos de Datos: Strings
    */
    fun datosString() {

        //Tipo caracter van entre comillas simples
        var caracter:Char = '8'

        //Un caracter o String tambien puede ser un numero
        // (Conversion de tipos)
        //Se usa para pasar un caracter a Int (-48 es un truco para dar con el numero correcto)
        //En la tabla decimal el 0 empieza en el 48 por eso el truco
        var caracterANumero:Int = caracter.code - 48

        Log.d(TAG, "Caracter = " + caracter)
        Log.d(TAG, "Numero = " + caracterANumero)

        //Tipo String
        var cadena:String = "Juan"

        Log.d(TAG, "Cadena = " + cadena)

        //Mediante corchetes escogemos el caracter del String
        Log.d(TAG, "Caracter de la cadena = " + cadena[2])

    }

    /*
    Tipos de Datos: Strings con secuencia de escape y Strings Puros (raw strings)
    */
    fun strings() {
        //String con escape es cuando usamos  (Cambio linea)
        // 	 (tabulador) etc
        var cadena1:String = "Juan\n\tMorales"
        Log.d(TAG, "Strings con secuencia de escape = " + cadena1)

        //String puro se usa literalmente lo que escribes con saltos de pagina incluidos
        //Se usa triple comillas
        var cadena2:String = """Juan     
              Morales"""
        Log.d(TAG, "Strings con secuencia de escape = " + cadena2)
        //Se puede acceder a funciones dentro de un String mediante $
        //Si accedes a mas funciones mediante ${}
        Log.d(TAG, "Mi nombre es: $cadena1 y tiene ${cadena1.length} caracteres ")

    }
    /*
    Tipo de datos Arrays
    */
    fun arrays() {
        //Array de Int
        var arreglo:Array<Int> = arrayOf(0,1,2,3)
        //Array de String
        var arreglo2:Array<String> = arrayOf("Alberto","Patricia","Morales","Guerra")
        //De manera Especifica podemos decir de que el Array es de solo int
        var arreglo3 = intArrayOf(0,1,2,3,4)

        Log.d(TAG, "La posicion 2 del array es = " + arreglo2[2])
    }
    /*
    Tipo de datos Any
    */
    fun any() {
        //Any puede ser cualquier dato (Caracter, int, Array, etc), Kotlin sabrá identificarlo
        var cualquiera:Any = 18.18f

        Log.d(TAG, "Tipo de dato cualquiera = " + cualquiera)
    }

    /*
    Introducción Operadores aritméticos, de comparación y lógicos
    */
    fun operadores() {
        //Aritmeticos  + - / * Suma, resta, division, multiplicacion
        //Comparacion  < > == <= >= menor que, mayor que, igual, menor e igual, mayor e igual
        //Logicos
        // ! Es lo contrario a lo que viene. Ej !> seria lo contrario es decir mayor                                                                                  ||
        // && (y) comparamos las dos y es "true" si los dos son verdaderos y si no falso
        // || (ó) comparamos las dos y es "true" si uno de las dos es verdadero
        var a = 5
        var b = 3
        var c = 12
        var resta = a - b
        var comparacion = a > b
        var comparacion2 = a !== a
        //Ejemplo &&
        var logico = a > b && c > a
        //Ejemplo ||
        var logico2 = a > b || b > c
        //Se puede combinar boleanos
        var logico3 = (a > b || b < c) && (c > a)

        Log.d(TAG, "Resta = " + resta)
        Log.d(TAG, "Comparacion = " + comparacion)
        Log.d(TAG, "Comparacion 2 = " + comparacion2)
        Log.d(TAG, "Ejemplo && = " + logico)
        Log.d(TAG, "Ejemplo || = " + logico2)
        Log.d(TAG, "Se puede combinar boleanos = " + logico3)
    }

}