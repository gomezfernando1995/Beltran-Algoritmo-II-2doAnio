public class Cifras {

    public int cantCifras(int n){
        String numString= String.valueOf(n);
        numString = numString.replace("-","");
        return numString.length();
    }

}
