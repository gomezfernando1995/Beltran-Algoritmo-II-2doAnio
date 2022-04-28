
import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class Monton {

    // -------------------ATRIBUTOS-------------------
    private int monton;

    //---------------CONSTRUCTOR-------------------
    public Monton() {
        monton = (int) Math.floor(Math.random() * (6 - 3 + 1) + (3));
    }

    //-------------------METODOS-------------------
   
    public int getMonton() {
        return monton;
    }

    public void setMonton(int monton) {
        this.monton = monton;
    }

    
    
    
}
