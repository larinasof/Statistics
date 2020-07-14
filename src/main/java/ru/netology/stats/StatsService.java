package ru.netology.stats;


public class StatsService {
    int[] sales;
    public static int calculateSum (int[] sales){
        int sum = 0;
        for (int sale : sales){
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage (int[] sales){
        int average = calculateSum(sales)/12;
        return average;
    }

    public int monthOfMaxSales (int[] sales){
        int max = sales[0];
        int monthOfMax = 0;
        for(int i=0; i<sales.length; i++) {
            if(sales[i] >= max) {
                max = sales[i];
                monthOfMax = i+1;
            }
        }
        return monthOfMax;
    }

    public int monthOfMinSales (int[] sales){
        int min = sales[0];
        int monthOfMin = 0;
        for(int i=0; i<sales.length; i++) {
            if(sales[i] <= min) {
                min = sales[i];
                monthOfMin = i+1;
            }
        }
        return monthOfMin;
    }


    public int calculateLessThanAverage (int[] sales){
        int average = calculateAverage(sales);
        int amountOfMonths = 0;
       for (int sale : sales) {
           if (sale < average){
               amountOfMonths += 1;
           }
       }
       return amountOfMonths;
    }

    public int calculateMoreThanAverage (int[] sales){
        int average = calculateAverage(sales);
        int amountOfMonths = 0;
        for (int sale : sales) {
            if (sale > average){
                amountOfMonths += 1;
            }
        }
        return amountOfMonths;
    }

}
