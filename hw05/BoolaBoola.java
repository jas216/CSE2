// Jose Sierra
// CSE 2
// hw05 - Program #2
/* the program contains 3 boolean variables to which their value is randomly assigned. 
 the program presents to the user a combination of boolean , ask the user to state the result
 of the expresion */

// import scanner to allow user input
import java.util.Scanner;

// class
public class BoolaBoola {
    // main method
    public static void main(String[] args){
        
    // declaration of variables
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    

    double x, y;
    boolean first, second, third;
    
    x = Math.random()*2;
    System.out.println("Enter a number: "+x); 
    
    y = Math.random()*2;
    System.out.println("Enter a number: "+y);
     
    
    first = (x > 1) ? true : false ;
    System.out.println(first);
    
        
    }
    
}

