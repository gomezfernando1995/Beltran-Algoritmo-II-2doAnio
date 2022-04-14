import java.util.Scanner;


/*
* Averiguar  si  un  número  real  introducido  por  teclado  tiene  o
* no  parte fraccionaria  (utilícese  el  método  Math.round()  que
 * aparece  descrito  en  elcapítulo 1, o si no, búscalo en Internet)*/

public class NumeroDecimal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float numero;
        System.out.println("Ingrese numero: ");
        numero = lector.nextFloat();

        System.out.println(Math.round(numero));

    }
}
