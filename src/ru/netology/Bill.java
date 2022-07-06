package ru.netology;

import ru.netology.taxes.TaxService;
import ru.netology.taxes.TaxType;

class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;


    // КОНСТРУКТОР
    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        String taxName = taxType.getTaxName();
        double taxAmount = taxType.calculateTaxFor(amount); // вычислить налог исходя из класса
        System.out.print("Оплачиваем " + taxName + " : ");
        taxService.payOut(taxAmount); // выплатить налог
    }
}
