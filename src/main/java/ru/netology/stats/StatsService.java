package ru.netology.stats;

public class StatsService {

    public int getTotalSumSales(int[] salesPerMonth) {
        int sum = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            sum += salesPerMonth[month];
        }

        return sum;
    }

    public int getAverageSalesAmount(int[] salesPerMonth) {
        int numOfMonths = salesPerMonth.length;
        int averageAmount = getTotalSumSales(salesPerMonth) / numOfMonths;

        return averageAmount;
    }

    public int getMonthWithMaxSale(int[] salesPerMonth) {
        int bestSalesMonth = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] >= salesPerMonth[bestSalesMonth]) {
                bestSalesMonth = month;
            }
        }

        return bestSalesMonth + 1;
    }

    public int getMonthWithMinSale(int[] salesPerMonth) {
        int worstSalesMonth = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] <= salesPerMonth[worstSalesMonth]) {
                worstSalesMonth = month;
            }
        }

        return worstSalesMonth + 1;
    }

    public int getMonthsBelowAverageSales(int[] salesPerMonth) {
        int averageSalesAmount = getAverageSalesAmount(salesPerMonth);
        int numberOfMonthsWithSalesBelowAverage = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] < averageSalesAmount) {
                numberOfMonthsWithSalesBelowAverage += 1;
            }
        }

        return numberOfMonthsWithSalesBelowAverage;
    }

    public int getMonthsAboveAverageSales(int[] salesPerMonth) {
        int averageSalesAmount = getAverageSalesAmount(salesPerMonth);
        int numberOfMonthsWithSalesAboveAverage = 0;
        for (int month = 0; month < salesPerMonth.length; month++) {
            if (salesPerMonth[month] > averageSalesAmount) {
                numberOfMonthsWithSalesAboveAverage += 1;
            }
        }

        return numberOfMonthsWithSalesAboveAverage;
    }

}
