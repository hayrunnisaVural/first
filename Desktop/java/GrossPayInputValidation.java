import java.util.Scanner;

public class GrossPayInputValidation {
   /**
 * @param args
 */
public static void main(String args[]) {
    int rate = 15;
    int maxHours = 40;
    double hoursWorked;
    
    System.out.println("how many hours did you work this week?");
    try (Scanner scanner = new Scanner(System.in)) {
         hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("invalid entry. ıt must be between 1 and 40.");
            hoursWorked = scanner.nextDouble();
            
        }
        scanner.close();
    }
    
    double gross = rate * hoursWorked ;
    System.out.println("Gross pay: $ " + gross);
        
    }

}
