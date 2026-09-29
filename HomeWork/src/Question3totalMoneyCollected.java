import java.util.Scanner;
/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/28/2026
 **/
public class Question3totalMoneyCollected {
    public static void main(String[] args) {


                double  adultMeals;
                double childMeals;
                double totalMeal;

                double adultTotal;
                double childTotal;
                double total;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of adult meals: ");
                adultMeals = sc.nextDouble();

                System.out.print("Enter number of child meals: ");
                childMeals = sc.nextDouble();

                adultTotal = adultMeals * 50.00;
                childTotal = childMeals * 37.50;
        totalMeal =  adultMeals + childMeals;
        total = adultTotal + childTotal;

        System.out.println("Number of total meals are: " + totalMeal);
                System.out.println("Total money for adult meals: R" + adultTotal);
                System.out.println("Total money for child meals: R" + childTotal);
                System.out.println("Total money for all meals: R" + total);
            }
        }


