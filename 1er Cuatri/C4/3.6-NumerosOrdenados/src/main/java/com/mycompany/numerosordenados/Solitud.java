
package com.mycompany.numerosordenados;
import java.util.Scanner;

public class Solitud {

       public int pedirDatoInt(Scanner lector, String txt){       
            System.out.println(txt);
            return lector.nextInt();  
       }

}
