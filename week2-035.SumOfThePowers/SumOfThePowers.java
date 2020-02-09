
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
       System.out.print("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());
            int result = 0;
            int x = 2;
            for (int i = 0; i <= number; i++){
                System.out.println("int result = (int)Math.pow(" + x + ", " + i + ")");
                int sum = (int)Math.pow(x, i);
                result = sum + result;
                
        }
        System.out.println("result: "+ result);
    }
}
