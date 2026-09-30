package Chapter3;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 **/
public class ForLoop {
  public static void main(String[] args) {
        //Display Java 5 times
        //Single condition
      System.out.println("==========Single Condition=========");
      for(int x = 1; x <= 8; x++){
          System.out.println("Java");
      }
      //Multiple Conditions
      System.out.println("==========Multiple Condition=========");
      for(int x = 1, y = 10; x <= 5; x++, y--){
          System.out.println(x + " -  " + y);
      }
      System.out.println("==========Compound Condition=========");
      for(int x = 1, y = 10; x <= 5 || y == 3; x++, y--){
          System.out.println(x + " ---  " + y);
      }
    }
}
