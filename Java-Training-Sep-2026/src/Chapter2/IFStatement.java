package Chapter2;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class IFStatement {
    public static void main(String[] args) {

        int a = 6, b = 10;
        boolean c = true, d = false;

        //unary IF

        if (a > b)
            System.out.println("a is greater than b" );
            System.out.println("Just another statement" );

            //Binary IF
        if(b > a || d){
            System.out.println("b is greater than a");
        }else{
            System.out.println("a is greater than b");
        }

    }
}
