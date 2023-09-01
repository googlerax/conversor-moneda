import javax.swing.*;

import conversion.FunOptionTime;
import conversion.FunOptions;


public class Main {
    public static void main(String[] args) {

        FunOptions money = new FunOptions(); // instancia de clase FunOptions
        FunOptionTime time = new FunOptionTime(); // instancia de clase FunOptionTime

        while (true) {
            try { // captura de NullPointerException, boton cancelar null
                String select = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión - Select a conversion option", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda - Currency converter", "Conversor de Tiempo - Time converter "}, "Seleccion")).toString();

                switch (select) {
                    // conversor de moneda
                    // swich como expresion
                    case "Conversor de Moneda - Currency converter" -> {
                        while (true) {

                            String cant = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir - Enter the amount of money you want to convert:");
                            if (cant == null) {
                                JOptionPane.showMessageDialog(null, "A cancelado la operacion - ADIOS", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if (numValid(cant)) {
                                double cantidad = Double.parseDouble(cant);
                                money.conversionMonedas(cantidad);

                                int option = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion? - perform another conversion?");
                                if (option == 0) {
                                    System.out.println("ok");

                                } else {
                                    System.out.println("adios");
                                    JOptionPane.showMessageDialog(null, "Muchas Gracias");
                                    System.exit(0); //llamada que se utiliza para finalizar el programa de manera explícita y exitosa.

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Valor invalido, vuelva a intentarlo - Invalid value, try again");
                            }
                        }
                    }
                    // conversor de tiempo
                    case "Conversor de Tiempo - Time converter " -> {

                        while (true) {
                            String cant = JOptionPane.showInputDialog("Ingresa el valor a convertir - enter the value to convert");
                            if (cant == null) {
                                JOptionPane.showMessageDialog(null, "A cancelado la operacion - ADIOS", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                            if (numValid(cant)) {
                                double val = Double.parseDouble(cant);
                               time.timeConverter(val);

                                int option = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion? - perform another conversion?");
                                if (option == 0) {
                                    System.out.println("ok");
                                    break; // break sale hacia menu de opciones

                                } else {
                                    System.out.println("adios");
                                    JOptionPane.showMessageDialog(null, "Muchas Gracias");
                                    System.exit(0); //llamada que se utiliza para finalizar el programa de manera explícita y exitosa.

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Valor invalido, vuelva a intentarlo - Invalid value, try again");
                            }

                        }


                    }

                }
            } catch (NullPointerException e) {
                System.out.println("A cancelado la operacion, ADIOS.");
                JOptionPane.showMessageDialog(null, "A cancelado la operacion - ADIOS", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }


    }

    // function que valida si la entrada es un número:
    public static boolean numValid(String num) {
        try {
            double n = Double.parseDouble(num);
            return (n >= 0); // retorna true cuando el número sea mayor a 0
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
