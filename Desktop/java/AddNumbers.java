import java.util.Scanner;

public class AddNumbers {
    public static void name(String args[]) {
        Scanner scanner = new Scanner(System.in);

        boolean again ;
        do{
            System.out.println("enter first number");
            double num1 = scanner.nextDouble();

            System.out.println("enter second number");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2 ;
            System.out.println("the sum is " + sum);
            System.out.println("would you like to start over?");
            again = scanner.nextBoolean();
        }
      while(again) ; 
      scanner.close();

    }
    
}
