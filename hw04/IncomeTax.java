// Jose Sierra
// CSE 2 
// hw04 - Program #1 Income Tax
/* The program prompts the user to enter an integer integer that gives the thousands
 of dollars of income and then writes the amount of tax on the income, according to:
 <20, 5%; >=20 and <40, 7%; >=40 and <78, 12%; >=78, 14%. */

import java.util.Scanner;

// define public class
public class IncomeTax {
    // main method:
    public static void main(String[] args) {
        System.out.println(" "); // prints out an empty line for visual appealling
    
        // declare variables
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int salary;
        double tax;
    
        
    
        System.out.print("Enter an integer giving the number of thousands: ");
        if (myScanner.hasNextInt()) {                                           // checks for input to be an integer
            // define input as salary
            salary = myScanner.nextInt();
            
            if (salary < 0 ) {
                System.out.println("Please enter a positive integer");
            }
            
            else if (salary >= 78) {
                tax = (int)(salary*1000*0.14)*100/100.0;     // computes applicable tax and converts double into integer
                System.out.println("The tax rate on $"+salary+"000 is 14%, and the tax is $"+tax);
            }
            
            else if (salary >= 40 && salary < 78) {
                tax = (int)(salary*1000*0.12)*100/100.0;     // computes applicable tax and converts double into integer
                System.out.println("The tax rate on $"+salary+"000 is 12%, and the tax is $"+tax);
            }
            
            else if (salary >= 20 && salary < 40) {
                tax = (int)(salary*1000*0.07)*100/100.0;     // computes applicable tax and converts double into integer
                System.out.println("The tax rate on $"+salary+"000 is 7%, and the tax is $"+tax);
            }
            
            else if (salary < 20) {
                tax = (int)(salary*1000*0.05)*100/100.0;     // computes applicable tax and converts double into integer
                System.out.println("The tax rate on $"+salary+"000 is 5%, and the tax is $"+tax);
            }
            
        }
            
        else {
            System.out.println("Please enter an integer");
        }
    
    System.out.println(" "); // prints out an empty line for visual appealling
    
    
    }
    
    
}
