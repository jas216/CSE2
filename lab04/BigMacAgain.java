// Jose Sierra 
// CSE 2
// lab04 - BigMacAgain.java
// The following program receives input from the user, as how many BigMacs
// are wanted and if the user wants one order of fries or not.
// The program prints out the total cost of the meal.

import java.util.Scanner;   // imports the scanner class

// defines public class:
public class BigMacAgain {
    
    // defines main method:
    public static void main(String[] args) {
        
        System.out.println(" "); // prints out an empty line for visual appealling
        
        // define variables 
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int nBigMacs;
        double subTotal, total;
        
        // prompt the user to enter how many big macs they want
        System.out.print("How many BigMacs would you like? Enter a number here: ");
        // the if statement makes sure the user entered an integer number
        if (myScanner.hasNextInt()) {
            nBigMacs = myScanner.nextInt();
            subTotal = (int)(nBigMacs*2.22*100)/(100.0);    // converts double into an integer
            System.out.println(nBigMacs+" at $2.22 each = $"+ subTotal);    // prints out the subtotal
        }
        
        // if the user didnt entered an integer, the program terminates
        else {
            System.out.println("Please enter an integer number");
            System.out.println("Purchase cancelled");
            return; // program terminates
            }
        
        // the program asks the user whether one order of fries is wanted or not
        System.out.print("Would you like one order of fries with that? Enter (Y/y/N/n): ");    
        String fries = myScanner.next();    // the scanner reads a string
        
        // the if statement makes sure Y/y/N/n was entered
        if (fries.equals("Y")||fries.equals("y")) {
            System.out.println("Fries = $2.15");
            total = (int)((subTotal+2.15)*100)/100.0;
            System.out.println("Your Total is: $"+total);
        }
        // else if responds if the user doesnt want fries
        else if (fries.equals("N")||fries.equals("n")) { 
           
            total = subTotal;
            System.out.println("Your Total is: $"+total);
    
        }
        // if the user didnt enter Y/y/N/n the program terminates 
        else { 
            System.out.println("Please enter either Y/y/N/n");
            System.out.println("Purchase cancelled");
            return;
        }
     System.out.println(" "); // prints out an empty line for visual appealling
    }
    
}
    
