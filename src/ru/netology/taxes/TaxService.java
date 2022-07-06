package ru.netology.taxes;
// НАЛОГОВАЯ СЛУЖБА
public class TaxService {
    // УПЛАТА НАЛОГА
    public void payOut(double taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}
