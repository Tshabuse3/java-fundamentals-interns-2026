package Chapter2;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? trueResults : falseResults
        int age = 15, number = 9;
        String feedback;

        //variable = condition ?  trueResults : falseResults
        feedback = (age >= 18) ? "You can vote" : "Sorry, you cannot vote";


        feedback = (number %2 == 0) ? "even" :
                (number %3 == 0) ? "multiple of 3": "odd";

        System.out.println(feedback);
    }
}
