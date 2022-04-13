/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circuloarealong;

import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class AreaYlong {
    
    public static void main(String[] args) {
        double area,longitud,radio;
        final double PI = 3.141592;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Radio? ");
        radio= lector.nextDouble();
        
        area = PI *Math.pow(radio, 2);
        longitud = 2*PI*radio;
        
        System.out.println("El area de la circurferencia es : "+area+"\n La longitud de la circunfencia es : "+longitud);
    }
}
