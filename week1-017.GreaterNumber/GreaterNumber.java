import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int number1st = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: "); 
        int number2nd = Integer.parseInt(reader.nextLine());
        
        
        if (number1st > number2nd ){
            System.out.println("Greater number: " + number1st);
        }
        else if(number2nd > number1st ){
            System.out.println("Greater number: " + number2nd);
        }
        else{
            System.out.println("The numbers are equal!");
        }

    }
}
