package conversion;
import javax.swing.*;

public class TimeConverter {
    // para horas
    public double hourToMinutes (double valor){
        double minutes = valor * 60;
        JOptionPane.showMessageDialog(null,valor +" Hs "+" equivalen a "+minutes+"'");
        return minutes;
    }

    public double hourToSecond (double valor){
        double second = valor * 3600;
        JOptionPane.showMessageDialog(null,valor +" Hs "+" equivalen a "+second+"''");
        return second;
    }

    //para minutos
    public double minuteToHour(double valor){
        double hour = valor / 60;
        JOptionPane.showMessageDialog(null,valor +"' "+" equivalen a "+hour+" Hs");
        return hour;
    }

    public double minuteToSecond (double valor){
        double second = (valor*3600)/60;
        JOptionPane.showMessageDialog(null,valor +"' "+" equivalen a "+second+"''");
        return second;
    }

    // para segundos
    public double secondToHour (double valor){
        double hour = valor/3600; // parte entera del decimal
        JOptionPane.showMessageDialog(null,valor +"'' "+" equivalen a "+hour+" Hs");
        return hour;
    }

    public double secondToMinute (double valor){
        double minute = (valor*60)/3600; // parte entera del decimal
        JOptionPane.showMessageDialog(null,valor +"'' "+" equivalen a "+minute+"'");
        return minute;
    }

    // para Dias

    public int dayToHour (int valor){
        int hour = valor * 24;
        JOptionPane.showMessageDialog(null,valor +" dia/dias"+" equivalen a "+hour+" Hs");
        return hour;
    }

    public int dayToMinutes (int valor){
        int minutes = valor * 1440;
        JOptionPane.showMessageDialog(null,valor +" dia/dias"+" equivalen a "+minutes+"'");
        return minutes;
    }

    public int dayToSecond (int valor){
        int second = valor * 86400;
        JOptionPane.showMessageDialog(null,valor +" dia/dias"+" equivalen a "+second+"''");
        return second;
    }































}
