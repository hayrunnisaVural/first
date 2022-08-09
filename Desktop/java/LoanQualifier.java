import java.util.Scanner;

public class LoanQualifier {
    /**
     * @param args
     */
    public static void main(String args[]){
        int rS = 30000;
        int rYe = 2;
         System.out.println("enter your salary:");
         Scanner scanner = new Scanner(System.in);
         double salary = scanner.nextDouble();
         System.out.println("enter how many years you worked your job:");
         double years = scanner.nextDouble();

          scanner.close();
         if(salary >= rS ){         
            
         if  (years >= rYe){
                System.out.println("congrats , you can take loan.");
            }
        
          
           else { System.out.println("sory you must at least worked  " + rYe + " years.");
        }
    }
           else{
            System.out.println("sory you must at least $ " + rS + " to take loan.");
         }
    }}
    

