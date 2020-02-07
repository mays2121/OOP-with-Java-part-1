
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberA = reader.nextInt();
        System.out.print("Type another number: ");
        int numberB = reader.nextInt();
        double division = numberA / (double)numberB;
        System.out.print("Division: " + numberA + " / " + numberB + " = " + division);

        // Implement your program here. Remember to ask the input from user.
    }
}
