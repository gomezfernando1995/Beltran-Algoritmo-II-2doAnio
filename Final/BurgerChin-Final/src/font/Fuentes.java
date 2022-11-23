package font;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author fernando
 */
public class Fuentes {

    private Font font = null;
    public String FLAME_negrita_otf = "FlameBold.otf";
    public String FLAME_condensed_otf = "FlameCondensed.otf";
    public String FLAME_regular_otf = "FlameRegular.otf";
    public String FLAME_cursiva_otf = "FlameSans.otf";

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
     */
    public Font fuente(String fontName, int estilo, float tamanio) {
        try {
            //Se carga la fuente
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
