package Chapter3;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/30/2026
 * break: end / exit the loop
 * continue: will skip the current iteration
 **/
public class LoopTerminationTechniques {
    public static void main(String[] args) {
        //break
        System.out.println("\n======Break====\n");
        for(int i = 1 ; i <= 10; i++){
            if(i == 5) break;
            System.out.println(i + " | ");
        }

        //continue
        System.out.println("\n======Continue====\n");
        for(int i = 1 ; i <= 15; i++){
            if(i %3 == 0)continue;
            System.out.println(i + " | ");
        }
        System.out.println("\n======Continue + Break====\n");
        for(int i = 0 ; i <= 15; i++){
            if(i == 5) break;
            if(i == 3)continue;
            System.out.println(i + " | ");
        }
    }
}
