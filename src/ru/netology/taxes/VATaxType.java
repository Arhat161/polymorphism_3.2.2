package ru.netology.taxes;

public class VATaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        return (amount * 18) / 100;
    }

    @Override
    public String getTaxName() {
        return "НДС, 18%";
    }
}
