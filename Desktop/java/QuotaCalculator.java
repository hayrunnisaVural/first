import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        int quota = 10 ;
         System.out.println("enter the number of sales you made this week:");
         Scanner scanner = new Scanner(System.in);
         int sales = scanner.nextInt();
         scanner.close();

         if(sales >= quota)
            System.out.println("congrats! youve met your quota");
         
         else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. you were " + salesShort);
         }
    }
    
}
