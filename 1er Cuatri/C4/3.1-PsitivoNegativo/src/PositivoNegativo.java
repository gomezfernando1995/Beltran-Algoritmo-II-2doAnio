/*
Leer  un  número  por  teclado  mediante un  método,  y  decir  si  es  positivo
o negativo con otro método. La salida por consola puede ser algo así como:
"el número X es positivo"
 */

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        VerificarNum verifcarNumero = new VerificarNum();
        int resultado;

        System.out.println("Ingrese numero : ");
        resultado = lector.nextInt();

        if (verifcarNumero.Positvivo_Negativo(resultado) == 0) {
            System.out.println("El numero "+resultado+" es es negativo");
        }else {
            System.out.println("El numero " + resultado + " es Positivo");
        }
    }
}
