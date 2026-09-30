package Chapter3;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 * WHILE Loop will continue to run until the condition is false
 **/
public class WhileLoop {
   public static void main(String[] args) {
        //Display Java 5 times
       int x = 6;


       while(x %3 == 0 ){
           System.out.println(x + " -Java");
           x+=2;
       }
       System.out.println("End");
    }
}
