import ru.netology.services.Task_7.services.ServiceExpenses;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int income = 100_000; // Доход в месяц
        int expenses = 60_000; // Разход в месяц
        int threshold = 150_000; // Сумма после который можно и отдохнуть

        ServiceExpenses service = new ServiceExpenses();
        int res = service.calculate(income, expenses, threshold);
        System.out.println(res);

    }
}