package ru.netology.taxes;

public class ProgressiveTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        double res = 0.0;
        if(amount > 100_000) {
            res = (amount * 15) / 100;
        } else if (amount > 0 && amount <= 100_000) {
            res = (amount * 10) / 100;
        }
        return res;
    }

    @Override
    public String getTaxName() {
        return "Прогрессивный налог ( до 100 тысяч = 10%, больше 100 тысяч = 15% )";
    }
}
