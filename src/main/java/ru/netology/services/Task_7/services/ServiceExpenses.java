package ru.netology.services.Task_7.services;


public class ServiceExpenses {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money > threshold) {
                money = money - expenses - ((money - expenses) / 3 * 2);
                count++;
            } else {
                money = money + income - expenses;

            }
        }
        return count;
    }
}





