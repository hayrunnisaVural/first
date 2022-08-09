import java.util.Scanner;

public class GradeMassage {
     /**
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("enter your letter grade=");
         try (Scanner scanner = new Scanner(System.in)) {
            String grade = scanner.next();
            String massage;
            
            switch(grade){
                case "A":
                    massage = " excellent job!";
                    break;
                case "B":
                    massage = " great job!";
                    break;
                case "C":
                    massage = " good job!";
                    break;
                case "D":
                    massage = "you need to work harder!";
                    break;
                case "F":
                     massage = "you failed!";
                    break;
                    default:
                    massage = "error. invalid grade";
                    break;


            }
            
   System.out.println(massage);
        }
        
    }
    
}
