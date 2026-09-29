package Chapter2;

import java.sql.SQLOutput;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class NestedIFStatement {
    public static void main(String[] args) {
        int creditScore = 500;
        double salary = 15000;
        boolean employmentStatus = true;
        String feedback = "Declined";

        if (employmentStatus) {
            if (salary >= 15000) {
                if (creditScore >= 6000) {
                    feedback = "Approved";
                } else if (creditScore >= 500 & creditScore <= 599) {
                    feedback = "Approved with exception";
                } else {
                    feedback = "Declined (Low Credit scrore)";
                }
            } else {
                System.out.println("You need to earn at least R15 000.00");
            }
        } else {
            feedback = "Declined! You need to be employed ";
        }

        System.out.println("Feedback : " + feedback);
    }
}