import javax.swing.*;

import conversion.FunOptions;
import conversion.ToCurrency;
import conversion.MonedaAPeso;

public class Main {
    public static void main(String[] args) {


//        FunOptions money = new FunOptions();
//
//
//        money.conversionMonedas(1);


//        test de incorporacion de iconos con javax.swing.ImageIcon

        ImageIcon customIcon = new ImageIcon("D:\\PROGRAMACION_\\ONE-oracle\\BACK-END-JAVA\\currency-converter\\src\\iconDollar.png");

        // Mostrar un cuadro de diálogo con el icono personalizado
        JOptionPane.showMessageDialog(null, "Esto es un mensaje con un icono personalizado.", "Icono Personalizado", JOptionPane.PLAIN_MESSAGE, customIcon);
    }


    }
