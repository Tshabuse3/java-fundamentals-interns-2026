package Chapter4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/1/2026
 **/
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum (Collection):" + calculateSum(5,6,9,7));
        System.out.println("Sum (Two Integers):" + calculateSum(5,6));
        System.out.println("Sum (Three Integers):" + calculateSum(5,6,7));
        System.out.println("Sum (Doubles):" + calculateSum(5.5,6.3));
        System.out.println("Sum (Float):" + calculateSum(3.63f, 5.38f));

        System.out.format("""
                Sum (Collection):       %d
                Sum (Two Integers):     %d
                Sum (Three Integers):   %d
                Sum (Doubles):          %.2f
                Sum (Float):            %.2f
                """, calculateSum(5,6,9,7)), calculateSum(5,6) , calculateSum(5,6,7), calculateSum(5.5,6.3), calculateSum(3.63f,5.38f));
    }

    /**
     * This method calculate and return the sum of two integers
     *
     * @param x First interger value
     * @param y Second integer value
     * @return The Sum of two integers
     */
    static int calculateSum(int x, int y) {
        return x + y;

    }

    /**
     * This calculate and return the sum of two double values
     *
     * @param x First double value
     * @param y Second double value
     * @return The sum of two doubles values
     */
    static double calculateSum(double x, double y) {
        return x + y;
    }

    /**
     * This calculate and return the sum of two floating pint values
     *
     * @param x First floating point value
     * @param y Second floating point value
     * @return The sum of two floating values
     */
    static float calculateSum(float x, float y) {
        return x + y;
    }

    /**
     * Calculate and return the sum of three integers
     *
     * @param r First integer
     * @param x Second integer
     * @param y Third integer
     * @return Sum of three integers
     */
    static int calculateSum(int r, int x, int y) {
        return x + y;
    }

    /**
     * Calculate and return the sum of any number of integer
     * @param numbers collection of integers
     * @return The sum of all integers in a collection
     */
    static int calculateSum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}