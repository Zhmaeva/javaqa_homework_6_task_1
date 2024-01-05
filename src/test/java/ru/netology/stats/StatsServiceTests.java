package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test
    public void shouldFindTotalSumSales() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getTotalSumSales(array);
        System.out.println("Сумма всех продаж за год " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSalesAmount() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageSalesAmount(array);
        System.out.println("Средняя сумма продаж за год " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithBiggestSale() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMonthWithMaxSale(array);
        System.out.println("Лучший месяц по продажам " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMinimumSale() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMonthWithMinSale(array);
        System.out.println("Худший месяц по продажам " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthsBelowAverageSales(array);
        System.out.println("В этом году количество месяцев с продажами ниже среднего  " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberMonthsWithSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthsAboveAverageSales(array);
        System.out.println("В этом году количество месяцев с продажами выше среднего  " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
