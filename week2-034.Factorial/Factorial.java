import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial is " + factorial);
    }
}
