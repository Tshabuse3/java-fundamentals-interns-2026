package Chapter4;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 **/
public class VoidMethods {
  public   static void main(String[] args) {

     displayMessage();
      System.out.println("============================");
      displayAddresss();
    }
    //as it will be executed from the main method we use static void

    static void displayMessage(){
        System.out.println("Hi, welcome to Java training ");
    }
    public static void displayAddresss(){
        System.out.println("""
               123 Main Street
               Rivonia
               Sandton
               0123
               """);
    }

}
