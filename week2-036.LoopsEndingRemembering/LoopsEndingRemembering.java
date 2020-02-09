import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int counter = 0;
        int value = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        while(true){
            System.out.print("");
            int numb = Integer.parseInt(reader.nextLine());    
            if(numb == -1){
                System.out.println("Thank you and see you later!");
            break;
            }
            sum += numb;
            counter++;
            if(numb%2 == 0){
                evenCounter++;
            }
            else{
                oddCounter++;
            }
           
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: "+ counter);
        System.out.println("Average: " + ((float) sum / (float)counter));
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + oddCounter);
        }
    }