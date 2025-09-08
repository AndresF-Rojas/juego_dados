import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrmJuego extends JFrame {

    public FrmJuego() {
        setTitle("Juego de Cartas");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDado1 = new JLabel();
        String archivoImagen = "imagenes/2.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));
        lblDado1.setIcon(imgDado);
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imgDado);
        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTituloLanzamiento = new JLabel("Lanzamientos");
        lblTituloLanzamiento.setBounds(30 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        lblTituloLanzamiento.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTituloLanzamiento);

        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        lblTituloCenas.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTituloCenas);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setBounds(30 + 2*imgDado.getIconWidth(), 40, 100, 100);
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72));//nombre_fuente, style_font, size_font
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setBackground(new Color(16, 64, 59));
        lblLanzamientos.setForeground(new Color(18,115,105));
        lblLanzamientos.setOpaque(true);
        getContentPane().add(lblLanzamientos);


        JLabel lblCenas = new JLabel("0");
        lblCenas.setBounds(140 + 2*imgDado.getIconWidth(), 40, 100, 100);
        lblCenas.setFont(new Font("Tahoma", 1, 72));//nombre_fuente, style_font, size_font
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setBackground(new Color(16, 64, 59));
        lblCenas.setForeground(new Color(18,115,105));
        lblCenas.setOpaque(true);
        getContentPane().add(lblCenas);


        

    }

}
