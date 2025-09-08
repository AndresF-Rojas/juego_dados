import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;
    public void lanzar(Random r){
        numero = r.nextInt(6)+1; //La clase random siempre arranca en 0 y termina en n-1, po eso el +1
    }

    public void mostrar (JLabel lbl){
        String archivoImagen = "imagenes/"+numero+".jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));
        lbl.setIcon(imgDado);
    }

}
