package conversion;

import javax.swing.*;

public class Test {

    public static void main(String[] args) {

        FunOptions money = new FunOptions();

        while (true) {
            try {
                String select = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión - Select a conversion option", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda - Currency converter", "Conversor de Temperatura"}, "Seleccion")).toString();

                switch (select) {
                    case "Conversor de Moneda - Currency converter":
                        while (true) {
                            String cant = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir - Enter the amount of money you want to convert:");
                            if (cant == null) {
                                JOptionPane.showMessageDialog(null, "A cancelado la operacion - ADIOS", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                break;
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
                                    System.exit(0);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Valor invalido, vuelva a intentarlo - Invalid value, try again");
                            }
                        }
                        break;

                    case "Conversor de tiempo":
                        System.out.println("test");
                        // aquí el caso para el conversor de temperatura
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("A cancelado la operacion, ADIOS.");
                JOptionPane.showMessageDialog(null, "A cancelado la operacion - ADIOS", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }






    }





    // funcion que válida si la entrada es un número
    public static boolean numValid(String num) {
        try {
            double x = Double.parseDouble(num);
            return (x>=0); // solo retorna true cuando el número es mayor a 0, no negativo.

        } catch (NumberFormatException e) {
            return false;
        }

    }


}
