package conversion;

import javax.swing.*;

public class FunOptionTime {

    // instancia de clase TimeConverter
    TimeConverter time = new TimeConverter();

    //funcion selectora

    public void timeConverter(double myInput) {

        String select = (JOptionPane.showInputDialog(null, "Que deseas convertir - what do you want to convert", "Conversor de Tiempo", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Dia a Hora - Day to Hour", "Dia a Minutos - Day to Minutes", "Dia a Segundos - Day to Second", "Hora a Minutos - Hour to Minutes", "Hora a Segundos - Hour to Second", "Minutos a Horas - Minutes to Hours", "Minutos a Segundos - Minutes to Seconds", "Segundos a Horas - Seconds to Hours", "Segundos a Minutos - Second to Minutes"}, "Seleccion")).toString();

        switch (select) {
            case "Dia a Hora - Day to Hour":
                time.dayToHour((int) myInput);
                break;
            case "Dia a Minutos - Day to Minutes":
                time.dayToMinutes((int) myInput);
                break;
            case "Dia a Segundos - Day to Second":
                time.minuteToSecond((int) myInput);
                break;
            case "Hora a Minutos - Hour to Minutes":
                time.hourToMinutes(myInput);
                break;
            case "Hora a Segundos - Hour to Second":
                time.hourToSecond(myInput);
                break;
            case "Minutos a Horas - Minutes to Hours":
                time.minuteToHour(myInput);
                break;
            case "Minutos a Segundos - Minutes to Seconds":
                time.minuteToSecond(myInput);
                break;
            case "Segundos a Horas - Seconds to Hours":
                time.secondToHour(myInput);
                break;
            case "Segundos a Minutos - Second to Minutes":
                time.secondToMinute(myInput);

        }
    }

}
