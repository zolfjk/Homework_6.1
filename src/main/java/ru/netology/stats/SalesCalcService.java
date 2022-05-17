package ru.netology.stats;

public class SalesCalcService {
    public long calcSumSales(long[] sales) {
        long score = 0;
        for (long sumSales : sales) {
            score += sumSales;

        }
        return score;
    }

    public long calcAverageSales(long[] sales) {
        int numberOfMonths = 0;
        for (long sumSales : sales) {
            numberOfMonths += 1;

        }
        return calcSumSales(sales) / numberOfMonths;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; //
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverageSales(long[] sales) {

        int belowAverageSales = 0;

        for (long sumSales : sales) {
            if (sumSales < calcAverageSales(sales)) {
                belowAverageSales += 1;
            }
        }
        return belowAverageSales;
    }

    public int salesAboveAverageSales(long[] sales) {

        int aboveAverageSales = 0;

        for (long sumSales : sales) {
            if (sumSales > calcAverageSales(sales)) {
                aboveAverageSales += 1;
            }
        }
        return aboveAverageSales;
    }
}

