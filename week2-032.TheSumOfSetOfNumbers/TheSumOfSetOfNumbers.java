
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        
        for(int i = 1; i <= number; ++i){
              sum += i;
              //sum = sum + i;
          }
        System.out.println("Sum is " + sum);

    }
}
