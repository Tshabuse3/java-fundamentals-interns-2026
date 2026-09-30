package Chapter4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 * Value Type Methods
 **/
public class ValueTypeMethods {
    public static void main(String[] args) {

        VoidMethods.displayMessage();
        System.out.println("Age: " + getAge());

        System.out.println(isEven());

    }

    static int getAge() {
        int yearOfBirth = 1995;
        int currentYear = 2026;

        return currentYear - yearOfBirth;
    }

    static Scanner getScanner() {
        return new Scanner(System.in);
    }
    static boolean isEven(){
        int num;

        System.out.println("Enter a number to check if it is even");
        num = getScanner().nextInt();

        return (num %2 ==0);

    }

}
