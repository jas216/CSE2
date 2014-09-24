// Jose Sierra 
// CSE2
// hw04 - Program #4
/* This program receives input from the user as an integer representing the number
of seconds that have elapsed durign the day, then the program dislpays the time in
conventional form */

// allows the program to receive input from user
import java.util.Scanner;


// define class
public class TimePadding {
    // define main method
    public static void main(String[] args) {
        System.out.println(" "); // prints out an empty line for visual appealling
        
        // define input method and device
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        // define varibales
        int timeInSeconds, hours, minutes, seconds;
        
        // receive input from the user as:
        System.out.print("Enter the time in seconds (integer): ");
        // if statement checks for a correct integer input
        if (myScanner.hasNextInt()) {
            timeInSeconds = myScanner.nextInt();
            
            /* if the user enters a negative number, or a number greater than the 
                number of seconds in a day, the program returns an error */
            if (timeInSeconds < 0 || timeInSeconds > 43200) {
                System.out.println(myScanner+" Is out of the range [0, 43200]");
            }
            
            else {
                hours = timeInSeconds/3600;
                minutes = (timeInSeconds%3600)/60;
                seconds = (timeInSeconds%3600)%60;
                
                System.out.println("The time is:");
                System.out.print(hours+":");
                
                if (minutes <10 || seconds <10) {
                    System.out.println("0"+minutes+":0"+seconds);
                }
                
                else if (minutes <10) {
                    System.out.println("0"+minutes+":"+seconds);
                }
                
                else if (seconds <10) {
                    System.out.println(minutes+":0"+seconds);
                }
                
                else {
                System.out.println(":"+minutes+":"+seconds);
                }
            }

        }
        
        // if an integer was not entered, the program returns an error
        else {
            System.out.println("An integer was not entered");
        }
        
    }
}

