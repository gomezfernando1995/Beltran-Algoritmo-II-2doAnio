import java.util.Scanner;

public class ComprarDolares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Compra c1 = new Compra();

        System.out.println("¿Cuántos dólares quiere comprar?");
        int dato = lector.nextInt();
        System.out.println("Ingrese precio de venta: ");
        double cambio = lector.nextDouble();
        c1.setPrecioventa(cambio);
        System.out.println("Deberá invertir $"+c1.pesos(dato));

    }
}
