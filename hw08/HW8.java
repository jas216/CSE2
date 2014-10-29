// Jose Sierra
// CSE2 hw08 - Methods assigment
// the following program receives input from the user and 


import java.util.Scanner;   // imports a scanner 

public class HW8 {      // defines class
    
    public static char getInput(Scanner one, String letter){        // first method
        return getInput(one,letter,1000);
    }       // end of forst method 
    
    public static char getInput(Scanner one, String letter, int num){           // second method 
    
        int trys=0;             // variable that tracks the number of user inputs 
        while(trys<num){                // while the number of user tries is less than the allowed number of tries, the program will keep running 
            String userInput=one.next();            // defines the variable userInput
                if(userInput.length()==1) {                 // restrains the user input to one character
                    for(int i=0;i<letter.length();i++){             // allows to read the String letter character by character
                        if(userInput.charAt(0)==letter.charAt(i)) {         // compares userInput with letter
                            return userInput.charAt(0);                 // returns userInput
                            
                        }
                    }
                    
                //System.out.println("You entered "+userInput+"");    
                    
                }
                
                else{
                    System.out.println("Invalid Input");
                }
                
                
                
           System.out.println("try again -"+userInput);         // returns error if userInput is invalid
           trys++;       // increments user tries 
        }
        
        
        System.out.println("Failed after 5 tries");
           return ' ';
    } // end of second method 
    
    
    
    
    public static void main(String [] args){            // main method
    char input;         // variable declaration 
    
    
    Scanner scan = new Scanner(System.in);          // define Scanner 
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit-");           // prompts the user to enter a char 
    input=getInput(scan, "Cc");             // calls second method 
    System.out.println("You entered "+input+"");            // prints out user's input 
    
       
    System.out.print("Enter 'y, 'Y', 'n', or 'N'-");        // prompts the user to enter yYnN
    input=getInput(scan, "yYnN", 5);        //close after 5 attempts 
    
    
    
    
    //input=getInput(scan,"Choose a digit.","0123456789");
    //System.out.println("You entered "+input+"");
    
        
    }       // end of main method
}