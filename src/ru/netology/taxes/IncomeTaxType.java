package ru.netology.taxes;

public class IncomeTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        return (amount * 13) / 100;
    }

    @Override
    public String getTaxName() {
        return "Подоходный налог, 13%";
    }

}
