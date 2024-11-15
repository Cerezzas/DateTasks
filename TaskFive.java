package date_tasks;

import java.time.LocalDate;

public class TaskFive {
    public static void main(String[] args) {

//        Task 5: növbəti ayın bu günü hansı həftənin günüdür

        LocalDate today = LocalDate.now();
        String dayOfTheWeek = today.getDayOfWeek().toString();
        System.out.println("Todays date: " + today );
        System.out.println("day of the week of this date in the current month: " + dayOfTheWeek);

        LocalDate nextMonth = today.plusMonths(1);
        System.out.println("Same date but next month: " + nextMonth);

        System.out.println();

        String nextMonthDayOfTheWeek = nextMonth.getDayOfWeek().toString();
        System.out.println("day of the week of this date in the next month: " + nextMonthDayOfTheWeek);

    }
}
