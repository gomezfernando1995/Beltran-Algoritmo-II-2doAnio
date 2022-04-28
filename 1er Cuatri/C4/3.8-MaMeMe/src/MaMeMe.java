/*
* Ejercicio 3.8: Mayor, menor, mediano (*)
Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el
menor y cuál el mediano. Y da gracias a que no lo hemos hecho con 4
variables. Prohibido usar arrays, suponiendo que sepas lo que son. Es un
ejercicio de lógica, no de bucles.

*
* */

import java.util.Scanner;

public class MaMeMe {
    public static void main(String[] args) {

        int a,b,c,mayor,menor,intermedio;
        Numero numero = new Numero();
        Scanner lector = new Scanner(System.in);

        a = numero.inputNum(lector,"ingrese num 1 : ");
        b = numero.inputNum(lector,"ingrese num 2 : ");
        c = numero.inputNum(lector,"ingrese num 3 : ");

         mayor = numero.mayor(a,b,c);
         intermedio = numero.medio(a,b,c);
         menor=numero.menor(a,b,c);

        System.out.println("Mayor: "+mayor+"\n Medio:"+intermedio+" Menor: "+menor);
    }
}
