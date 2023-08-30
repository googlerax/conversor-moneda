package conversion;

import javax.swing.*;

public class FunOptions {

    // instancia de MonedaAPeso y ToCurrency
    MonedaAPeso pesoAr = new MonedaAPeso();
    ToCurrency moneda = new ToCurrency();

    public void conversionMonedas(double myInput) {

        String select = (JOptionPane.showInputDialog(null,
                "¿En que moneda deseas convertir? - What currency do you want to convert? ", "Monedas - (Currency)",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos (ARS) a Dólar (USD)", "De Pesos (ARS) a Euro (EUR)", "De Pesos (ARS) a Libras (GBP)", "De Pesos (ARS) a Yen (JPY)", "De Pesos (ARS) a Won Coreano (KRW)", "De Dólar (UDS) a Pesos (ARS)", "De Euro (EUR) a Pesos (ARS)", "De Libras (GBP) a Pesos (ARS)", "De Yen (JPY) a Pesos (ARS)", "De Won (KRW) Coreano a Pesos (ARS)"},
                "Seleccion")).toString();

        switch (select) {
            case "De Pesos (ARS) a Dólar (USD)":
                moneda.pesoToDollar(myInput);
                break;
            case "De Pesos (ARS) a Euro (EUR)":
                moneda.pesoToEuro(myInput);
                break;
            case "De Pesos (ARS) a Libras (GBP)":
                moneda.pesoToLibra(myInput);
                break;
            case "De Pesos (ARS) a Yen (JPY)":
                moneda.pesoToYen(myInput);
                break;
            case "De Pesos (ARS) a Won Coreano (KRW)":
                moneda.pesoToWon(myInput);
                break;
            case "De Dólar (UDS) a Pesos (ARS)":
                pesoAr.dollarToPeso(myInput);
                break;
            case "De Euro (EUR) a Pesos (ARS)":
                pesoAr.euroToPeso(myInput);
                break;
            case "De Libras (GBP) a Pesos (ARS)":
                pesoAr.libraToPeso(myInput);
                break;
            case "De Yen (JPY) a Pesos (ARS)":
                pesoAr.yenToPeso(myInput);
                break;
            case "De Won (KRW) Coreano a Pesos (ARS)":
                pesoAr.wonToPeso(myInput);
                break;
        }
    }
}




