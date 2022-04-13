public class Venta {
    private double preciocompra;

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double dolares (int pesos){
        return pesos/preciocompra;
    }
}
