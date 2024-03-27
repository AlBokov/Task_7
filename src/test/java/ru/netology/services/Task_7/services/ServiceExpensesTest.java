package ru.netology.services.Task_7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceExpensesTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")
    public void testNumberMonthsVacation(int income, int expenses, int threshold, int monthVacation) {
        ServiceExpenses service = new ServiceExpenses();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(monthVacation, actual);
    }




}
