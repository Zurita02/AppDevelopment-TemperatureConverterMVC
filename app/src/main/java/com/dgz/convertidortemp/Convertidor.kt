package com.dgz.convertidortemp

//Modelo

/**
 * Autor: Diego Zurita Villarreal
 *
 * Resuelve la conversión de temperaturas (°C -> °F)
 */

class Convertidor
{
    fun convertirCaF(celsius: Double): Double{
        val fahrenheit = (9.0/5)*celsius +32
        return fahrenheit
    }

    fun ConvertirFaC(fahrenheit: Double): Double{
        val celsius = (5.0/9)*(fahrenheit-32)
        return celsius
    }
}