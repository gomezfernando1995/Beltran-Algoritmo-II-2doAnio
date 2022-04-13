
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class ReemplazarCadena {
      public static void main(String[] args) {
        String texto,txt2;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese frase: ");
        texto = lector.nextLine();
         
        System.out.println(texto.replace("hola", "chau"));  
        
    }  
}
