package date_tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TaskOne {
    public static void main(String[] args) {

       // Task 1:  Calculate the difference between two dates in days:

        String dateOne = "13/05/2022";
        String dateTwo = "27/05/2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.from(formatter.parse(dateOne));
        System.out.println("Date 1: " + date1);

        LocalDate date2 = LocalDate.from(formatter.parse(dateTwo));
        System.out.println("Date 2: " + date2);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between: " + daysBetween);

    }
}
