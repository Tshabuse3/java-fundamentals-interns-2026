package Exercises;

import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 * Keep asking for age until a positive number is entered.
 **/
public class practise {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age  ");
        age = sc.nextInt();

        while(age <=0 ){
            System.out.println("Please enter positive age");
            age = sc.nextInt();
        }
    }
}
