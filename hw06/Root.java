// Jose Sierra 
// CSE2 hw06 - Program #2
/* the program estimates the square root of a double from users's input
tolerance = 0.0000001  */ 

import java.util.Scanner;

//public class
public class Root {
    // main method
    public static void main (String[] args){
    
        // variables declaration 
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        double low=0, high=0, middle, x, multiple, tolerance; 
        
        System.out.println("Enter a number:");
        // user input
        if (myScanner.hasNextDouble()){
            
            x= myScanner.nextDouble();
            
            low=0;
            high=x + 1;
            multiple= 0.0000001*(1+x);
            tolerance= 0.0000001;
           
            middle = (high-low)/2;
            double middleSquare= middle*middle;
            
            
            while (tolerance > middle){

                if (middleSquare > x ){
                    high = middle;
                    middle = (high-low)/2;
                    middleSquare= middle*middle;
                    
                }
                
                else {
                    low = middle;
                    middle = (high-low)/2;
                    middleSquare= middle*middle;
                }  
                
                
            }
            
            System.out.println("The square root is: "+low);
            System.out.println("The square root is: "+high);
            
        }
        
        
        else {
            System.out.println("Invalid Input");
        }
             
       
    }
}