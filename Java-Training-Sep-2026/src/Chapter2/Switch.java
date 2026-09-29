package Chapter2;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 9/29/2026
 **/
public class Switch {
    public static void main(String[] args) {
        String module = "C#";
        String lecturer;
        //Smith (Java, SQL), Carol (C#, VB) James (Python, JavaScript, TypeScript)

        switch (module){
            case "Java":
            case "SQL"  :  lecturer = "Smith";
            break;
            case "C#" :
             case "VB" : lecturer = "Carol";
            break;
            case "Python" :
            case "JavaScript" :
            case "TypeScript" : lecturer ="James";
            break;
            default: lecturer = "Invalid module";
        }
        System.out.println("Lecturer for module " +  module + " is " + lecturer);
    }
}
