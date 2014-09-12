// Jose Sierra
// CSE2
// lab03
// Sept/12/2014
// Arithmetic Calculations and Input
// the program computes the cost of buying BigMAc's including percentage tax.

import java.util.Scanner;

// define a class
public class BigMac {
    
    // main method;
    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println(" ");
        
        Scanner myScanner;  // define the input device
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of BigMacs (an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        
        System.out.print("Enter the cost per BigMac as "+ " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //user enters percent, though proportion is needed
     
        
        double cost$; // defines a variable name for the total cost
        cost$=nBigMacs*bigMac$*(1+taxRate); // get the whole amount dropping the decimal fraction
        
        int dollars;    //whole dollar amount of cost dimes, pennies for storing digits to the right to the right of the decimal point for the cost$
        dollars = (int) cost$;   // get dimes amounts,e.g, where the % (mod) operator returns the remainder after the division: 583%100 -> 83
        
        int dimes;  // defines a variable name for the dimes slot 
        dimes=(int)(cost$*10)%10;
        
        int pennies; // defines a variable name for the pennies slot
        pennies = (int)(cost$*100)%10;
        
        System.out.println("The total cost of " + nBigMacs + " BigMacs, at $" + bigMac$ + " per BigMac, with a" +
            " sales tax of " + (int)(taxRate*100) + "%, is $" + dollars+'.'+dimes+pennies);
        
        System.out.println(" ");
        System.out.println(" ");
        
        // end of method
    }
    
    // end of class
}

// end of program 


