// Jose Sierra
// CSE 2
// hw04 - Program #2
/* this program prompts the user to enter an integer identifying each month of 
the year and then displays the number of days in the month. For february, the 
user is asked to enter the year.
*/

import java.util.Scanner;       // enables input from the user 

// define public class
public class Month {
    // main method:
    public static void main(String[] args){
        System.out.println(" "); // prints out an empty line for visual appealling
        
        // declare variables
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int month, year;
        
        System.out.print("Enter an integer corresponding to a month of the year (1-12): ");
        if (myScanner.hasNextInt()) {       // checks for input to be an integer
            // define input as month
            month = myScanner.nextInt();
            if (month <= 0){
                System.out.println("You did not enter a number between 1-12");
            }
            
            else if (month == 2) {
                System.out.print("Enter a giving year (integer): ");
                if (myScanner.hasNextInt()) {
                    year = myScanner.nextInt();
                    if (year < 0) {
                        System.out.println("You did not enter a positve integer");
                    }      
                    
                    else {
                        boolean leap = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);
                        
                        if (leap == true){
                         System.out.println("The month has 29 days");
                        }
                    
                        else {
                         System.out.println("The month has 28 days");
                        }
                    }
                }
                
                else {
                    System.out.println("You did not enter an integer");
                }
                
            }
            
            else if (month % 2 == 0 && month != 2 && month != 6) {
                System.out.println("The month has 30 days");
            }
            
            else {
                System.out.println("The month has 31 days");
            }
            
           
        }
            
        else {
            System.out.println("You did not enter an integer");
        }
        
        
        
    System.out.println(" "); // prints out an empty line for visual appealling
    }
}
