
public class Dado {
    
    private int valor;
    
    public Dado(){
        this.valor = (int) Math.floor(Math.random() * (6 - 1 + 1) + (1));
    }
    
    /**
     * GETTER DADO  / OBTENER VALOR DEL DADO
     */
    public int getValor() {
        return valor;
    }

    /**
     * SETTER DADO / INSERTAR VALOR DEL DADO
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
 
}
