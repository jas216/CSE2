// Jose Sierra
// CSE2 - hw07 - program #1
/* the program force the user to enter a number between 1 and 9, and then 
prints a stack of numbers depending on the number entered */ 

import java.util.Scanner;

public class NumberStack {                                                      // main class
    public static void main(String[] args){                                     // main method
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int number, count=0;                                                           // variable declaration
        
        System.out.print("Enter a number between 1 and 9 inclusive: ");
        if (myScanner.hasNextInt()) {
           number = myScanner.nextInt(); 
           
           if (0 < number && number < 10) {
               
               System.out.println("your number is: "+number);
               System.out.println("count= "+count);
               
               for(int i=1;i<=number;i++){
                    for(int k=1; k<=i; k++){
                        for(int j=0;j<=count;j++){    
                            System.out.print(i);
                            
                        }
                        System.out.println();  
                        
                    }
                    
                for (int l=0; l<=count; l++) {
                        System.out.print("-");
                }
               
                System.out.println();    
                count+=2;
                   
               }
               
               
               
               /* while (count < number){
                    count++;
                    System.out.println(count);
                }
                
                */ 
                
            }
            
            else {
                System.out.println("The number is invalid");
            }
            
        }
        
        else {
            System.out.println("The number is invalid");
        }
    
        
        
        
        
        
    }
}