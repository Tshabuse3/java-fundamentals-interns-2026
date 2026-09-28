package Chapter1;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/28/2026
 **/
public class ExploreStrings {
    public static void main(String[] args) {
        String sentence = "In Java, variables must be declared before they can be used.";

        //Number of characters
        System.out.println("Length: " + sentence.length());
        //Position
        System.out.println("Position: " + sentence.indexOf("a",5,10));
        //Character at a position (10)
        System.out.println("10th possition has: " + sentence.charAt(10));

        //Last position of a
        System.out.println("Position: " + sentence.lastIndexOf("a", 15));

    }
}
