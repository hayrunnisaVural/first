import java.util.Scanner;

public class TestResults {
    /**
     * @param args
     */
    public static void main(String args[]){
        System.out.println("enter your test score:");
        try (Scanner scanner = new Scanner(System.in)) {
          double score = scanner.nextDouble();
           char grade;
            if(score < 60 ){
              grade = 'F';
            }
            else if(score < 70){
              grade = 'D';
            }
            else if(score < 80){
              grade = 'C';
            }
            else if(score < 90){
              grade = 'B';}
              else {
                  grade = 'A';
              }
              System.out.println("your grade is "  + grade);
        }
          }
    
}
