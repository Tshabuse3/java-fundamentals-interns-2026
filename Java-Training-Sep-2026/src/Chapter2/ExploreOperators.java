package Chapter2;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class ExploreOperators {
    public static void main(String[] args) {
        int a,b;
        //Assignment
        //Assign
        a = 5;
        b = 15;
        System.out.println("------Assign----");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);
        //Add and assign
        a += 5;
        b += 2;
        System.out.println("------ADD and Assign----");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        //Subtract and assign
        a -= 3;
        b -= 6;
        System.out.println("------Substract and Assign----");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        //Multiply and assign
        a *= 2;
        b *= 3;
        System.out.println("------Multiply and Assign----");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        //Divide and assign
        a /= 7;
        b /= 6;
        System.out.println("------Divide and Assign----");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

    }
}
