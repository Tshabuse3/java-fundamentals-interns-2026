package Chapter2;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 5, b = 25;
        boolean c = false;

        //equality
        System.out.println(a == b && c); //false
        // not equal
        System.out.println(a != b || (a < b)); //true
        //Greater than
        System.out.println(a > (b / 3) ); //false
        //Less than
        System.out.println(b > a || (c)); //true

        System.out.println( !(a >= (b / 5)) );// false

        System.out.println( !(a < b ) && (b == 5) || !c); //false


    }
}
