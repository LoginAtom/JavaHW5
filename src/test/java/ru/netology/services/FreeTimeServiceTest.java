package ru.netology.services;

import org.junit.jupiter.api.Test;
//import ru.netology.services.FreeTimeService;

public class FreeTimeServiceTest {

    @Test
    public void testCalculate_withSampleData() {
        FreeTimeService service = new FreeTimeService();

        int income = 3000;
        int expense = 2000;
        int threshold = 5000;

        int result = service.calculate(income, expense, threshold);
        System.out.println("Месяцев отдыха: " + result);

    }


}





