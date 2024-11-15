package date_tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TaskTwo {
    public static void main(String[] args) {

//        Task 2:  Find the next occurrence of a given day of the week:
//        Given a day of the week (e.g., Monday), write an algorithm to find the date of
//        the next occurrence of that day.


        LocalDate startDate = LocalDate.of(2024,11,15);
        System.out.println("Start Date: " + startDate);
        DayOfWeek targetDay = DayOfWeek.FRIDAY;
        LocalDate nextTargetDay = startDate.with(TemporalAdjusters.next(targetDay));
        System.out.println("Next Target Day: " + nextTargetDay);

    }
}
