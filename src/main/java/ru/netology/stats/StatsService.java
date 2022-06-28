package ru.netology.stats;

public class StatsService {


    public long salesSum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }


    public double averageSum(long[] sales) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return average = sum / sales.length;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public double monthBelowAverage(long[] sales) {
        int x = 0;
        double average = averageSum(sales);
        for (long sale : sales) {
            if (sale < average) {
                x += 1;
            }
        }
        return x;
    }


    public double monthAboveAverage(long[] sales) {
        int x = 0;
        double average = averageSum(sales);
        for (long sale : sales) {
            if (sale > average) {
                x += 1;
            }
        }
        return x;
    }

}



