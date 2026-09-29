package Chapter2;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 4;

        //pre-increment
        System.out.println("current value of x: " +  x);
        System.out.println("Pre-increment: " + ++x);//


        //pre-decrement
        System.out.println("current value of x: " +  x);
        System.out.println("Pre-increment: " + --x);//
        System.out.println("value after Pre-increment: " + x);

         x = 25;

        //pre-decrement
        System.out.println("current value of x: " +  x);
        System.out.println("Pre-increment: " + x++);//
        System.out.println("value afterPre-increment: " + x);

        x = 16;

        //post-Increment
        System.out.println("current value of x: " +  x);
        System.out.println("Post-increment: " + x++);//
        System.out.println("value after Pre-increment: " + x);

        x *= 2;
        //post-decrement
        System.out.println("current value of x: " +  x);
        System.out.println("Post-increment: " + x--);//
        System.out.println("value after Pre-increment: " + x);

    }
}
