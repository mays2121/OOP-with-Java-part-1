
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberA = reader.nextInt();
        System.out.print("Type another number: ");
        int numberB = reader.nextInt();
        
        int result = numberA + numberB;
        System.out.print("Sum of the numbers: " + result);
        // Implement your program here. Remember to ask the input from user
    }
}
