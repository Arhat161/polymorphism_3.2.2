package ru.netology;

import ru.netology.taxes.IncomeTaxType;
import ru.netology.taxes.ProgressiveTaxType;
import ru.netology.taxes.TaxService;
import ru.netology.taxes.VATaxType;

public class Main {

    public static void main(String[] args) {
        // новый объект налоговой службы
        TaxService taxService = new TaxService();
        // массив платежей с различными типами налогообложения
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(100_000, new IncomeTaxType(), taxService),
                new Bill(100_000, new VATaxType(), taxService),
                new Bill(199_725.452, new ProgressiveTaxType(), taxService),
        };
        // перебираем в цикле платежи из массива и проводим каждый платеж
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i]; // получить новый счет из массива счетов
            bill.payTaxes(); // оплата налога
        }
    }
}
