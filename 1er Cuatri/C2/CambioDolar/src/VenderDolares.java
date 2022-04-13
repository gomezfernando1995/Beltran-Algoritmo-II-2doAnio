import java.util.Scanner;

public class VenderDolares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Venta v1 = new Venta();

        System.out.println("¿Cuántos pesos quiere comprar?");
        int dato = lector.nextInt();
        System.out.println("Ingrese precio de compra: ");
        double cambio = lector.nextDouble();
        v1.setPreciocompra(cambio);
        System.out.println("Deberá invertir u$s "+v1.dolares(dato));

    }
}
