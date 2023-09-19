package com.dgz.convertidortemp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dgz.convertidortemp.databinding.ActivityMainBinding

//Controlador

/**
 * Autor: Diego Zurita Villarreal
 *
 * Controlador para comunicar View-Model (MVC)
 */

class MainActivity : AppCompatActivity()
{
    //Referencia al modelo
    private val modelo = Convertidor() //Crea el objeto

    //Referencias a los componentes gráficos
    private lateinit var binding: ActivityMainBinding

    //Se llama cuando se está cargando la app, cuando requiere saber qué
    // componentes gráficos quiero mostrar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //Se muestra la app en la pantalla y el usuaario ya puede interactuar
    override fun onStart(){
        super.onStart()
        binding.btnConvertir.setOnClickListener {
            //El usuario hizo click
            println("Hizo click...")
            //1.
            val celsius = binding.etCelsius.text.toString().toDouble()
            val fahrenheit = modelo.convertirCaF(celsius)
            binding.etFahrenheit.setText(fahrenheit.toString())
        }
    }
}