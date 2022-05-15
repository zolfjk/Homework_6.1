package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesCalcService salesCalc = new SalesCalcService();

        System.out.println("Сумма всех продаж: " + salesCalc.calcSumSales(sales));

        System.out.println("Средняя сумма всех продаж в месяц: " + salesCalc.calcAverageSales(sales));

        System.out.println("Последний месяц с максимальными продажами: " +  salesCalc.maxSales(sales));

        System.out.println("Последний месяц с минимальными продажами: " +  salesCalc.minSales(sales));

        System.out.println("Количество месяцев с продажами ниже среднего: " +  salesCalc.salesBelowAverageSales(sales));

        System.out.println("Количество месяцев с продажами выше среднего: " +  salesCalc.salesAboveAverageSales(sales));

    }
}