package conversion;

import javax.swing.*;

public class ToCurrency {


//    Metodo de peso Argentino a Dólares
    public void pesoToDollar(double val){
        double dolar = val*0.0029;
        JOptionPane.showMessageDialog(null,"$"+val+" ARS equivalen a "+dolar+ " USD", "Peso a Dolar Americano", JOptionPane.PLAIN_MESSAGE);
    }
//"Título del Cuadro de Diálogo"
    public void pesoToEuro(double val){
        double euro = val * 0.0026;
        JOptionPane.showMessageDialog(null,"$"+val+" ARS equivalen a "+euro+ " EUR", "Peso a Euros", JOptionPane.PLAIN_MESSAGE);
    }

    public void pesoToLibra(double val){
        double libra = val * 0.0023;
        JOptionPane.showMessageDialog(null,"$"+val+" ARS equivalen a "+libra+ " GBP", "Peso a Libra Esterlina", JOptionPane.PLAIN_MESSAGE);
    }

    public void pesoToYen(double val){
        double yen = val * 0.42;
        JOptionPane.showMessageDialog(null,"$"+val+" ARS equivalen a "+yen+ " JPY", "Peso a Yen Japones", JOptionPane.PLAIN_MESSAGE);
    }

    public void pesoToWon(double val){
        double won = val*3.81;
        JOptionPane.showMessageDialog(null,"$"+val+" ARS equivalen a "+won+ " USD", "Peso a KWR", JOptionPane.PLAIN_MESSAGE);
    }





}


