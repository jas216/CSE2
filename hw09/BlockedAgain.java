// Jose Sierra 
// CSE2 - hw09 - Blocked Again
// 
// imports a Scanner 
import java.util.Scanner;

public class BlockedAgain {     // main method 
    public static void main (String [] s){
        
        int m;
        // force user to enter int in range 1-9, inclusive
        m = getInt();
        allBlocks(m);
    }   // end of main method
    
    
    
    // retrieves input from the user 
    public static int getInt() {
        Scanner myScanner = new Scanner(System.in); 
        int a;
        System.out.print("Enter an integer between 0 and 9, inclusive: ");
        a = myScanner.nextInt();  
        return a;   
        
        
    }
    // checks the input is an integer 
    public static boolean checkInt() {
        //Scanner myScanner = new Scanner(System.in);
        boolean a1; 
        Object a = getInt(); 
        if (a instanceof Integer) {
            return a1 = true;
        }
        
        else {
            
            return a1 = false; 
        }
        
        
        
    }
    // checks range 
    public static int checkRange(boolean a1) {
        int c = getInt();
        if (a1 == true) {
            if (0 <= c && c <= 9) {
                System.out.println("..."+c);
                return c;
            }
            
            // fail to be inside the range 
            else {
                System.out.println("Enter an integer betwee 0 and 9, inclusive");
                return c; 
            }
        }
        // fail to be an integer 
        else {
            System.out.println("Enter an integer");
            return c; 
        }
        
    }
     
    // prints out the stack of numbers 
    public static allBlocks() {
        for (int i = 1; i <= number; i++) {
            for (int k = 1; k <= i; k++) {
                for (int j = 0; j <= count; j++) {
                    System.out.print(i);
                }
            }
        }
    }
    
    
}   // end of class BlockedAgain 
