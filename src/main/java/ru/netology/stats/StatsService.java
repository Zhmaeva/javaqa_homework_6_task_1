package ru.netology.stats;

public class StatsService {

    public int getTotalSumSales(int[] salesPerMonth) {
        int sum = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            sum += salesPerMonth[month];
        }
        System.out.println("Сумма всех продаж за год "+ sum);
        return sum;
    }

    public int getAverageSalesAmount(int[] salesPerMonth) {
        int numOfMonths = salesPerMonth.length;
        int averageAmount = getTotalSumSales(salesPerMonth) / numOfMonths;

        System.out.println("Средняя сумма продаж за год " + averageAmount);

        return averageAmount;
    }

    public int getMonthWithBiggestSale(int[] salesPerMonth) {
        int bestMonth = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] > salesPerMonth[bestMonth]) {
                bestMonth = month;
            }
        }
        System.out.println("Лучший месяц по продажам " + bestMonth);

        return bestMonth;
    }

}
