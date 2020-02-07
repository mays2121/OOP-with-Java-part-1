
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int old = Integer.parseInt(reader.nextLine());
        
        if( old >= 0 && old <= 120){
            System.out.println("OK");
        }
        else if( old < 0 || old > 120){
            System.out.println("Impossible!");
        }
        else{
            System.out.println("Your age is undefined");
        }

    }
}
