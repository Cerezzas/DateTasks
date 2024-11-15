package date_tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

////        Task 4: Write a Java program that takes the birth date of a person as
//        input and calculates their age based on the current date

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth: ");
        String birthDate = sc.nextLine();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(birthDate, format);
        System.out.println("Date of birth: " + localDate);

        LocalDate currentDate = LocalDate.now();

        long age = ChronoUnit.YEARS.between(localDate, currentDate);
        System.out.println("Your age: " + age);
    }
}
