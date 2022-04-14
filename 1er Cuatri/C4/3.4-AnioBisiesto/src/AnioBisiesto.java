
/*

Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de
 4;utilícese el operador módulo. ¡Pero hay más excepciones! Los múltiplos de 100 no son bisiestos,
 aunque sean múltiplos de 4. Pero los múltiplos de 400sí, aunque sean múltiplos de 100. Qué follón.
 La Tierra es muy maleducadaal no ajustarse a los patrones de tiempo humanos.Resumiendo:  un  año  es
 bisiesto  si  es  divisible  entre  4,  a  menos  que  seadivisible entre 100. Sin embargo, si un año es
 divisible entre 100 y además esdivisible entre 400, también resulta bisiesto.

* */


import java.util.Scanner;

public class AnioBisiesto {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Bisiesto verificarBisiesto = new Bisiesto();
        int anio;

        System.out.println("Ingrese anio:");
        anio = lector.nextInt();

        if(verificarBisiesto.AnioBisiesto(anio) == 1)
        {
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }

}
