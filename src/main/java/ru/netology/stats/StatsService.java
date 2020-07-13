package ru.netology.stats;


public class StatsService {
    public static int calculateSum (){
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int sale : sales){
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage (){
        int average = calculateSum()/12;
        return average;
    }

    public int monthOfMaxSales (int[] sales){
        int max = sales[0];
        for (int sale : sales) {
            if (max <= sale) {
                max = sale;
            }
        }
        int monthOfMax = 0;
        for (int sale : sales) {
            monthOfMax += 1;
            if (sale == max) {
                return monthOfMax;
            }
        }
        return monthOfMax;
    }

    public int monthOfMinSales (int[] sales){
        int min = sales[0];
        for (int sale : sales) {
            if (min >= sale) {
                min = sale;
            }
        }
            int monthOfMin = 0;
            for (int sale : sales){
                monthOfMin += 1;
                if (sale == min) {
                    return monthOfMin;
                }
        }
        return monthOfMin;
    }

    public int calculateLessThanAverage (int[] sales){
        int average = calculateAverage();
        int amountOfMonths = 0;
       for (int sale : sales) {
           if (sale < average){
               amountOfMonths += 1;
           }
       }
       return amountOfMonths;
    }

    public int calculateMoreThanAverage (int[] sales){
        int average = calculateAverage();
        int amountOfMonths = 0;
        for (int sale : sales) {
            if (sale > average){
                amountOfMonths += 1;
            }
        }
        return amountOfMonths;
    }

}
