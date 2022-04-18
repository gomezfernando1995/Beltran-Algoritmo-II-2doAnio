
package com.mycompany.juegodenim;

public class Paquetes {
    
    
        public void mostrarPqt(int pqt,String msj)
        {
                   System.out.print(msj+pqt+" PALILLOS =");
                   for(int i =0;i<pqt;i++)
                  {
                      System.out.print("[]");
                  }
                   System.out.println("");
        }
}
