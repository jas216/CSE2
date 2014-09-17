// Jose Sierra
// CSE 2
// hw03 - Problem #3 FourDigits.java
// the program receives input as a double and prints the out the 
// first four digits to the right of the decimal point

// import scanner
import java.util.Scanner;

// define class
public class FourDigits {
    // define main method
    public static void main(String[] args) {
        
        // print out an empty line for visual appealing
        System.out.println(" ");
        
        // define the input device
        Scanner myScanner;  
        myScanner = new Scanner(System.in);
    
        
        System.out.print("Enter a double :");
        double x = myScanner.nextDouble();
        
        // define variables and compute digits 
        int x1, x2, x3, x4;         // each variable corresponds to each of the first four digits respectively
        x1 = (int)(x*10)%10; 
        x2 = (int)(x*100)%10;
        x3 = (int)(x*1000)%10;
        x4 = (int)(x*10000)%10;
        
        System.out.print("The first four digits after the decimal point are: ");
        System.out.print(x1);       // print out each variable in a single line
        System.out.print(x2);        
        System.out.print(x3);
        System.out.println(x4);     // System.out.println adds a line after the four digits are printed
        
        
        System.out.println(" ");    // prints an extre line for visual appealing 
        
        
    } // end of main method
    
} // end of class