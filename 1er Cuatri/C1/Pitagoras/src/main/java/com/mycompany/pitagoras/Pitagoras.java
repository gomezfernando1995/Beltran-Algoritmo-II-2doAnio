
import java.util.Scanner;


/**
 * HACR UN PROGRAMA Q CALCULE LA HIPOTENUSA DE UN TRIANGULO RECTANGULO .
 * SE DEBE PEDIR COMO DATO LOS CATETOS
 * LA HIPOTENUSA ES LA RAIZ CUADRADA DE LA SUMA DE LOS
 * CUADRADOS DE LOS CATETOS
 */
public class Pitagoras {
    public static void main(String[] args) {
        double cat1,cat2,hipotenusa;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese 1er cateto: ");
        cat1 = lector.nextDouble();
        System.out.println("Ingrese 2do cateto: ");
        cat2= lector.nextDouble();
        
        hipotenusa = Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
                
        System.out.println("La hipotenusa da "+hipotenusa);
                
    }
            
}
