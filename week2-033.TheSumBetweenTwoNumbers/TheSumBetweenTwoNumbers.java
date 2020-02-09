
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int number = Integer.parseInt(reader.nextLine());
        
        for(int i = firstNum; i <= number; ++i){
              sum += i;
          }
        System.out.println("Sum is " + sum);

    }
}