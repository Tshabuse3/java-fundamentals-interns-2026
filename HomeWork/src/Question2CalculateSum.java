import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/28/2026
 **/
public class Question2CalculateSum {
    public static void main(String[] args) {
        double num1;
        double num2;
        double sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = sc.nextDouble();

        System.out.println("Please enter Second Number: ");
        num2 = sc.nextDouble();

        sum = num1 + num2 ;
        System.out.println("The sum of two numbers is : " + sum);


    }
}
