package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleCalcServiceTest {

    @Test
    public void shouldSum() {
        SalesCalcService salesCalcService = new SalesCalcService();

        long[] sales = {11, 7, 9, 12, 13};

        long actual = salesCalcService.calcSumSales(sales);
        long expected = 11 + 7 + 9 + 12 + 13;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        SalesCalcService salesCalcService = new SalesCalcService();

        long[] sales = {7, 8, 9, 10, 11};

        long actual = salesCalcService.calcAverageSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumSales() {
        SalesCalcService salesCalcService = new SalesCalcService();

        long[] sales = {11, 7, 9, 13, 12};

        long actual = salesCalcService.maxSales(sales);
        long expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumSales() {
        SalesCalcService salesCalcService = new SalesCalcService();

        long[] sales = {11, 7, 9, 13, 12};

        long actual = salesCalcService.minSales(sales);
        long expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSales() {
        SalesCalcService salesCalcService = new SalesCalcService();

        long[] sales = {7, 8, 9, 10, 11};

        long actual = salesCalcService.salesBelowAverageSales(sales);
        long expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSales() {
        SalesCalcService salesCalcService = new SalesCalcService();

        long[] sales = {8, 9, 10, 11, 12, 13, 14};

        long actual = salesCalcService.salesAboveAverageSales(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}

