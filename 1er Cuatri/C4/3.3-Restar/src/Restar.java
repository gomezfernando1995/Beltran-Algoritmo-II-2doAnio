


/*Ejercicio 3.3: Restar (*)Leídos dos números por teclado, llamémosles A y B,
 calcular y mostrar la resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3,
  el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7,
  el resultado debe ser B – A,es decir, 3.*/


import java.util.Scanner;

public class Restar {
    public static void main(String[] args) {

        double num1, num2,resultado;
        Scanner lector = new Scanner(System.in);
        VerificarResta verificarResta= new VerificarResta();

        System.out.println("Ingrese num1:");
        num1 = lector.nextDouble();
        System.out.println("Ingrese num2:");
        num2 = lector.nextDouble();

        System.out.println("El resultado es "+verificarResta.verificar(num1,num2));
    }
}

