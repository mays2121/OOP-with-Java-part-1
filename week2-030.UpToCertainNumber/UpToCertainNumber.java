
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
            System.out.print("Up to what number? ");
            int number = Integer.parseInt(reader.nextLine());
            
            for (int i = 1; i <= number; i++){
                System.out.println(i);
        }
    }
}
