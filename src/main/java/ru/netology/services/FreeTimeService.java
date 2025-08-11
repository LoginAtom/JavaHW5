package ru.netology.services;

public class FreeTimeService {
    public int calculate(int income, int expense, int threshold) {
        int months = 0; // счетчик месяцев отдыха
        int money = 0; // начальный баланс

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Отдых
                money -= expense; // траты на отдых , ежемесячные и
                money /= 3; // остаток делится на 3
                months++;
            } else {
                money += income;
                money -= expense;
            }
        }
                return months;
            }
        }