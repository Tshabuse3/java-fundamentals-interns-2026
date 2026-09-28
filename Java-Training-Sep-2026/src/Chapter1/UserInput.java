package Chapter1;

import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/28/2026
 * Gte input from the user using scanner object
 **/
public class UserInput {

    public static void main(String[] args) {
        //declare
        String name;
        int age;
        double height;
        Scanner sc = new Scanner(System.in);
        //assign

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();

        System.out.println("Enter height: ");
        height = sc.nextDouble();

        //Use
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

    }
}
