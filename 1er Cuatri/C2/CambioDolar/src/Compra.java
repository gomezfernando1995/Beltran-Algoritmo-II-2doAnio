public class Compra {
    private double precioventa;

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public double pesos(int dolares){
        return precioventa * dolares;
    }
}
