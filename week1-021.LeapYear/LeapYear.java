
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        // the year divided into 4 will not give remainder && the year divided 100 should be any remainder (ex: 2012)
        // 2012, you will have no remainder by dividing 4 and have reminder by dividing 100, so this is a lapyear
        // the year divided into 400 will not give remainder
        if( ((year  %4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)){
            System.out.println("The year is a leap year.");
        }
        else{
            System.out.println("The year is not a leap year.");
        }
    }
}
