package Chapter4;

import java.util.Scanner;
import java.time.Year;
/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 **/
public class Homework {

  public   static void main(String[] args) {

      int birthYear;
      double testMark;
      int age;

      Scanner input = new Scanner(System.in);

      greetings();

      System.out.print("Enter First Name: ");
      String firstName = input.nextLine();

      System.out.print("Enter Last Name: ");
      String lastName = input.nextLine();

      System.out.print("Enter Birth Year: ");
      birthYear = input.nextInt();

      System.out.print("Enter Test Mark: ");
      testMark = input.nextDouble();

      age = determineAge(birthYear);
      String grade = determineGrade(testMark);

      displayOutput(firstName, lastName, age, grade);
    }
    public static void greetings() {

      System.out.println("Vho tanganedzwa kha system yashu vha ENJOY!!!");
    }

    /***
     * termine and return the grade based on the Test Mark
     * @param testMark Test Mark
     * @return The grade as (A+, A, B, C, D,D-, F)
     */
    public static String determineGrade(double testMark) {
        String grade;
        if (testMark > 90)
            grade = "A+";
        else if (testMark >= 80)
            grade = "A";
        else if (testMark >= 70)
            grade = "B";
        else if (testMark >= 60)
            grade = "C";
        else if (testMark >= 50)
            grade = "D";
        else if (testMark >= 40)
            grade = "D-";
        else
            grade = "F";

        return grade ;
    }

    /**
     * Determine and return the age by subtracting the birth year from the current year
     * @param birthYear Birth Year
     * @return Age as an integer
     */

    public static int determineAge(int birthYear) {
        //final int CURRENT_YEAR = Year.now().getValue();
        // return CURRENT_YEAR -birthYear
        return 2026 - birthYear;
    }

    public static void displayOutput(String firstName, String lastName, int age, String grade) {

        System.out.println("\nStudent Information");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Grade of the student based \n" + "on their test mark: " + grade);
    }
}
