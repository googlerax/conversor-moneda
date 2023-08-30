package conversion;

import javax.swing.*;

public class FunOptions {

    // instancia de MonedaAPeso y ToCurrency
    MonedaAPeso pesoAr = new MonedaAPeso();
    ToCurrency moneda = new ToCurrency();

    public void conversionMonedas(double myInput) {

        String select = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
                "Seleccion")).toString();

        switch (select) {
            case "De Pesos a Dólar":
                moneda.pesoToDollar(myInput);
                break;
            case "De Pesos a Euro":
                moneda.pesoToEuro(myInput);
                break;
            case "De Pesos a Libras":
                moneda.pesoToLibra(myInput);
                break;
            case "De Pesos a Yen":
                moneda.pesoToYen(myInput);
                break;
            case "De Pesos a Won Coreano":
                moneda.pesoToWon(myInput);
                break;
            case "De Dólar a Pesos":
                pesoAr.dollarToPeso(myInput);
                break;
            case "De Euro a Pesos":
                pesoAr.euroToPeso(myInput);
                break;
            case "De Libras a Pesos":
                pesoAr.libraToPeso(myInput);
                break;
            case "De Yen a Pesos":
                pesoAr.yenToPeso(myInput);
                break;
            case "De Won Coreano a Pesos":
                pesoAr.wonToPeso(myInput);
                break;
        }
    }
}




