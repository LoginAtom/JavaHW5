package ru.netology.services;

public class FreeTimeService {
    public int calculate(int income, int expense, int threshold) {
        int months = 0; // счетчик месяцев отдыха
        int money = 0; // начальный баланс

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                months++; // увеличиваем счетчик месяцев отдыха
                money -= expense * 4; // траты на отдых за месяц
            } else {
                money += income - expense; // работа или накопление
            }
            if (money < 0) {
                money = 0; // баланс не может быть отрицательным
            }
        }
        return months;
    }
}
