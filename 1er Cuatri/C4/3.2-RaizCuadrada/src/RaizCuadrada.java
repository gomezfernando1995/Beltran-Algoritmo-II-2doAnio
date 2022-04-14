



/*Calcular  la  raíz  cuadrada  de  un  número  introducido  por  teclado.
 Hay  que tener la precaución de comprobar que el número sea positivo*/

import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero para calcular la raiz : ");
        numero = lector.nextInt();

        while(numero<0) {
        System.out.println("Error, Reingrese el dato ");
        numero = lector.nextInt();
        }

        System.out.println("La raiz cuadrada es "+Math.sqrt(numero));
    }
}
