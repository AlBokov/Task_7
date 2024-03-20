package ru.netology.services.Task_7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class serviceExpensesTest {

    @ParameterizedTest
    @CsvSource({
            "100000,60000,150000,2",
            "10000,3000,20000,3"
    })
    public void testNumberMonthsVacation(int income, int expenses, int threshold, int monthVacation) {
        serviceExpenses service = new serviceExpenses();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(monthVacation, actual);
    }




}
