
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        
        while(true){
            System.out.print("Temperatur: ");
            double grad = Double.parseDouble(reader.nextLine());
           
            if ((grad >= -30) && (grad <= 40)){
                Graph.addNumber(grad);               
            }
            else{
                System.out.println("Wrong Degree");
            }
            
        }
            
            
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
