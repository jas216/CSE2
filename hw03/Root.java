// Jose Sierra
// CSE 2
// hw 03 - program #2 Root.java
// Root.java receives input as a double and prints a crude estimate of its cube root,
// and then the value of this estimate cubed. 

// import scanner 
import java.util.Scanner;

// define class
public class Root {
    // define main method
    public static void main(String[] args) {
        
        // print out an empty line for visual appealing
        System.out.println(" ");

        Scanner myScanner;  // define the input device
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number: "); 
        double x = myScanner.nextDouble();
        
        // following the suggested method in the instructions:
        double guess = x/3;
        double guess1 = (guess*guess*guess+x)/(3*guess*guess);
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);
        double estimate = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
     
        
        // system prints out an estimate for the cube root of x 
        System.out.println("The number's cube root (estimated) is: "+estimate);
        
        // estimate cubed
        double estimateCubed = estimate*estimate*estimate;
        System.out.println("The estimated cube root cubed is: "+estimateCubed);
        
        // print out an empty line for visual appealing
        System.out.println(" ");
        
    }
    
}