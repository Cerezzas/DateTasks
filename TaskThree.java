package date_tasks;

import java.time.LocalDateTime;
import java.time.Year;

public class TaskThree {
    public static void main(String[] args) {

//        Task 3:  Calculate the number of days until the end of the year

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        int day = localDateTime.getDayOfYear();
        System.out.println("Number of the current day: " + day);

        int year = Year.now().getValue();

        // Using Year.isLeap()
        boolean isLeap = Year.of(year).isLeap();

        // Output the result
        if (isLeap) { //(366 days)
            int number = 366 - day;
            System.out.println("The number of days until the end of the year: "+ number + " days till the " + Year.now().plusYears(1) );
//            System.out.println(year + " is a leap year (366 days).");

        }
        else { //(365 days)
            int number = 365 - day;
            System.out.println("the number of days until the end of the year: "+ number + " days till the " + Year.now().plusYears(1));
            System.out.println(year + " is a common year (365 days).");
        }
    }
}
