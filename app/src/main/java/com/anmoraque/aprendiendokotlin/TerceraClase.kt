package com.anmoraque.aprendiendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//Creo una constante para el Log
private const val TAG = "ETIQUETA_LOG"
/*
En esta actividad hemos hablado de:
Clases , Propiedades y Objetos
Métodos y Constructores
Herencias
Tipos de clases
*/
class TerceraClase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera_clase)
        //Aqui voy llamando a las funciones
        //Instanciamos un objeto (manzana) de la clase (Frutas)
        var manzana = Frutas("verde", "acida", 6, 50)
        Log.d(TAG, manzana.sabor)
        //Llamamos al metodo de la clase hasta que la manzana se pudre
        Log.d(TAG, "${manzana.pudrirse()}")
        Log.d(TAG, "${manzana.pudrirse()}")
        //Llamamos a los constructores de la clase (Frutas2)
        var manzanasinhojas = Frutas2("Rojo","Dulce",4)
        var manzanaConHojas = Frutas2("Verde","Agria",5,2)
        Log.d(TAG, "${manzanaConHojas.numHojas}")
        //Herencia de Frutas2
        var aguacate = Frutas2.FrutasConGrasa(10)
        aguacate.color = "Verde"
        Log.d(TAG, "${aguacate.color}")




    }
    /*
    Clases en Kotlin
     */
    //Las clases se nombran con la primera mayusculas y en () los atributos
    class Frutas (color:String, sabor:String, precio:Int, frescura:Int) {
        //Creamos los atributos
        var color: String = " "
        var sabor: String = " "
        var precio: Int = 0
        var frescura: Int = 0
        //Inicializamos los atributos
        //this.color es el atributo que hemos creado y lo igualamos
        //al dato que recibimos en la clase entre parentesis (color)
        init {
            this.color = color
            this.precio = precio
            this.sabor = sabor
            this.frescura = frescura

        }
        //Tambien se pueden crear metodos para las clases
        //En este Ej. cada vez que lo llamamos resta un 20 a la frescura
        //hasta llegar a 0 que decimos que esta podrida
        fun pudrirse(): Int {

            if (frescura <= 100) {

                frescura = frescura - 20
            }
            if (frescura <= 0){
                frescura = 0
                Log.d(TAG, "La fruta esta podrida")
            }
            return frescura
        }

    }
    /*
   Constructores en Kotlin
    */
    //Las clases se nombran con la primera mayusculas y en () vacios
    //porque en este caso vamos a usar constructores
    //Si ponemos open es porque esta abierta, si no escribimos nada es clase cerrada (Final)
    //Para poder heredar de ella tiene que ser open
    open class Frutas2(){
        //Creamos los atributos
        var color:String = ""
        var sabor:String = ""
        var precio:Int = 0
        var numHojas:Int = 0
        //Creamos el constructor y en () los atributos que queremos que tenga este constructor
        constructor(color:String,sabor:String,precio:Int):this(){
            this.color = color
            this.sabor = sabor
            this.precio = precio
        }
        //Podemos crear distintos constructores y en () los atributos que queramos
        constructor(color:String,sabor:String,precio:Int,numHojas:Int):this(){
            this.color = color
            this.sabor = sabor
            this.precio = precio
            this.numHojas = numHojas
        }
        //Creamos una clase nueva de Frutas con su atributo (cantidadGrasa)
        //y tambien su constructor, la cual hereda de Frutas 2
        class FrutasConGrasa():Frutas2(){

            var cantidadGrasa:Int = 0

            constructor(grasa:Int):this()
            {
                this.cantidadGrasa = grasa
            }
        }


    }


}