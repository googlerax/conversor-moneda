package conversion;

import javax.swing.*;

public class MonedaAPeso {

// metodos conversion de monedas extranjeras a peso:

    public void dollarToPeso(double val){
        double dolar = val * 740;
        System.out.println(dolar);
        JOptionPane.showMessageDialog(null,"$"+val+" USD equivalen a "+dolar+ " ARS", "USD a Peso ARS", JOptionPane.PLAIN_MESSAGE);
    }
    //"Título del Cuadro de Diálogo"
    public void euroToPeso(double val){
        double euro = val * 804;
        JOptionPane.showMessageDialog(null,"$"+val+" EUR equivalen a "+euro+ " ARS", "EUR (Euros a Peso ARS", JOptionPane.PLAIN_MESSAGE);
    }

    public void libraToPeso(double val){
        double libra = val * 442.38;
        JOptionPane.showMessageDialog(null,"$"+val+" GBP equivalen a "+libra+ " ARS", "GPB (Libras Esterlinas) a Peso ARS", JOptionPane.PLAIN_MESSAGE);
    }

    public void yenToPeso(double val){
        double yen = val * 2.40;
        JOptionPane.showMessageDialog(null,"$"+val+" YJP equivalen a "+yen+ " ARS", "YPJ (Yen) a Peso ARS", JOptionPane.PLAIN_MESSAGE);
    }

    public void wonToPeso(double val){
        double won = val * 0.26;
        JOptionPane.showMessageDialog(null,"$"+val+" KWR equivalen a "+won+ " ARS", "KWR (Won) a Peso ARS", JOptionPane.PLAIN_MESSAGE);
    }







}
