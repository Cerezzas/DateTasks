package date_tasks;

import java.time.LocalDate;

public class TaskFive {
    public static void main(String[] args) {

//        Task 5: növbəti ayın bu günü hansı həftənin günüdür

        
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatterAll = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("d");
        System.out.println("Today is: "+today.format(formatterAll));
        System.out.println("It is: " + today.getDayOfWeek());
        int day = Integer.parseInt(today.format(formatterDay));
//        System.out.println("Day of the month: "+today.format(formatterDay));

        Month month = Month.of(today.getMonthValue());
//        System.out.println("Month of today: "+month);


        Year year = Year.of(today.getYear());
        Month nextMonth = month.plus(1);

        LocalDate nextDate = LocalDate.of(year.getValue(), nextMonth.getValue(), day);
        System.out.println("Next date: "+nextDate);


        System.out.println("It will be: " + nextDate.getDayOfWeek());




    }
}
