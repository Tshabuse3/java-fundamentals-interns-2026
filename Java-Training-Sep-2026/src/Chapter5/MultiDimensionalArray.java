package Chapter5;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/1/2026
 **/
public class MultiDimensionalArray {
   public static void main(String[] args) {
       String[] arStudents = new String[]{"John", "Kate", "Jessica", "Lerato", " Crol" };
       int[][] arTestSCore = new int[][]{
               {74,63, 70},//row1 John
               {69, 74, 70,},//row2 Kate
               {88, 71, 73},//row3 Jessica
               {78, 87, 94},//row4 Lerato
               {96, 74, 94},//row5 Carol



       };
       System.out.println("Name\tTest 1\tTest 2\tTest 3" +
       "\n---------------------------------------------");
       for(int row = 0; row < arStudents.length; row++){
           System.out.println(arStudents[row] + "\t" );

           for(int col = 0; col < arTestSCore[row].length ; col++){
               System.out.println(arTestSCore[row][col] + "\t\t");

           }
           System.out.println();
       }
    }
}
