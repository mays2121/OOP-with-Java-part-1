
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String name = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        String name1 = "alex";
        String name2 = "emily";
        
        String pass1 = "mightyducks";
        String pass2 = "cat";
        

        if( (name.equals(name1)) && (password.equals(pass1))){
            System.out.println("You are now logged into the system!");
        }
        else if((name.equals(name2)) && (password.equals(pass2))){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password was invalid!");
        }
    }
}
