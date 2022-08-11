package com.anmoraque.aprendiendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

/*
En esta actividad hemos creado un formulario y vimos:
    Creando Vistas (LinearLayout, ConstrainLayout, etc)
    Creando los elementos de las vistas
    Uniendo vista con código
    Aplicando listener a botón
 */
class CuartaClase : AppCompatActivity() {
    //Funcion principal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuarta_clase)
        //Creamos el valor y hacemos referencia a su vista
        // Entre <> Ponemos el tipo de vista () Ponemos su id de vista
        val bSaludar = findViewById<Button>(R.id.bSaluda)
        val eTNombre = findViewById<EditText>(R.id.eTNombre)
        val cBDesarrollador = findViewById<CheckBox>(R.id.cBDesarrollador)
        //Añado el listener al button
        bSaludar.setOnClickListener(View.OnClickListener {
            //Si la funcion ValidaDatos() es true mostramos un Toast
            if (ValidaDatos()) {
                //Si el CheckBox es chequeado a true mostramos un Toast
                if (cBDesarrollador.isChecked) {
                    //Usamos un Toast para dar la Bienvenida sabiendo que es desarrollador
                    Toast.makeText(this, "Bienvenido " + eTNombre.text + ", se que eres desarrollador", Toast.LENGTH_LONG).show()
                    //Si el CheckBox es chequeado a false mostramos un Toast
                } else {
                    //Usamos un Toast para dar solo la Bienvenida
                    Toast.makeText(this, "Bienvenido " + eTNombre.text, Toast.LENGTH_LONG).show()
                }
                //Si no ha ValidaDatos() ni a chequeado mostramos un Toast
            } else {
                //Usamos un Toast para que ponga su nombre
                Toast.makeText(this, "Escribe tu nombre para saludarte", Toast.LENGTH_LONG).show()
            }
        })

    }

    fun ValidaDatos(): Boolean {
        //Creamos el valor de nuevo para esta funcion y hacemos referencia a su vista
        // Entre <> Ponemos el tipo de vista () Ponemos su id de vista
        val eTNombre = findViewById<EditText>(R.id.eTNombre)
        //Creamos otra variable para recoger el nombre escrito
        val nombreUsuario = eTNombre.text
        //Validamos que este nombreUsuario tenga algun valor
        //Si la variable nombreUsuario.isNullOrEmpty() "Es null o esta vacio"
        if (nombreUsuario.isNullOrEmpty()) {
            //Si es null o esta vacio regresamos un false
            return false
        }
        //Si no pues regresamos un true
        return true
    }
}