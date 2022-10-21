import java.util.Scanner;
/**
 * ACS-1903 Lab 6 Q7
 * @author (Enter your name and student number)
 */
public class PositiveOrNot{
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        String response;
        int number;
        
        String message;     // the result, so i don't have to repeat println

        // place your code here
        
        do{
            // since this is a doe while this code will exectute at least once
            System.out.println("Enter a number:");
            number = kb.nextInt();
            
            // set the message as either positive or not positive
            message = number > 0 ? "positive" : "not positive";
            
            // now print the message
            System.out.println(message);
            
            // get the response for another round
            System.out.println("Would you like to enter another number? yes/no");
            response = kb.next();
            response = response.toLowerCase();
        }// end do while
        while(response.equals("yes"));

        System.out.println("program terminated normally");
    }// end main
}// end class
