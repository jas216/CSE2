// Jose Sierra 
// CSE2 - hw10 Playing Poker Program 1 
// Program accepts ten integer and proceeds to check for duplicated integers within the array 

import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] arg) {
        
        Scanner scan = new Scanner(System.in);        // defines scanner variable 
        int num[] = new int[10];      // new array 
        
        String answer =" "; 
        // as long as the user inputs y or Y, the program keeps running 
        do {
            System.out.print("Enter 10 ints- ");            // prompts the user to enter 10 integers 
            for (int j= 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            
            String out="The array ";
            out += listArray(num);           //return a string of the form "{2, 3, -9}"   
            
            // checks if any integer is duplicated 
            if (hasDups(num)) {
                out += "has ";          // adds "has" to String out 
            }
            else {
                out += "does not have "; // adds "does not have" to String out 
            }
            
            
            out += "duplicates";        // adds "duplicates" to String out 
            
            System.out.println(out);
            
            out = "The array ";         // redefines String out 
            out += listArray(num);    
            
            // checks for exactly one duplication 
            if (exactlyOneDup(num)) {
                out += "has ";          // adds "has" to String out 
            }
            else {
                out += "does not have ";            // adds "does not have" to String out 
            }
            
            out += "exactly one duplicate.";        // adds "exactly one duplicate." to String out 
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");        // asks the user wheter to continue or not 
            answer = scan.next();
            
            
        }
        
        while (answer.equals("Y") || answer.equals("y"));
        
    }
    // method checks for duplicates 
    public static boolean hasDups(int[] num) {
        boolean dups=false;
            for (int a=0; a<num.length; a++) {
                for (int b=a+1; b<num.length; b++) {
                    if (b!=a && num[b] == num[a]) {
                            dups=true;
                            
                    }        
                }
            }
        
            
        return dups; 
            
    } // end of hasDups 
    
    // method checks for exactly one duplicate 
    public static boolean exactlyOneDup(int[] num) {
        boolean oneDups=false;
        int c=0; 
            for (int a=0; a<num.length; a++) {
                for (int b=a+1; b<num.length; b++) {
                    if (b!=a && num[b] == num[a]) {
                            c++;            // tracks the number of duplicates 
                            
                    }        
                }
            }
            
        if (c==1) {
            oneDups=true;
        }
        else {
            oneDups=false;
        }
        return oneDups;
    } // end of exactlyOneDup 
    
    
    // method prints array 
    public static String listArray(int num[]) {
        String out = "{";
        
        // introduces a comma after each entry 
        for (int j =0; j < num.length; j++) {
            
            if (j > 0) {
                out+=", ";
            }
            out+=num[j];
        }
        
        out+="} ";
        return out;
    } // end of listArrey method 
    
} // end of class 



