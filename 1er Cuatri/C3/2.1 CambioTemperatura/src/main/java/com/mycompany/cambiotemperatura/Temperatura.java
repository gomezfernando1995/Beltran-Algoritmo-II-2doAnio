/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cambiotemperatura;

public class Temperatura {

    public double celciusAfarenheit(double temp) {

        return (1.8)*temp+32;
    }
    
     public double farenheitAcelcius(double temp) {
        return  (temp-32)/1.8;
    }
}
