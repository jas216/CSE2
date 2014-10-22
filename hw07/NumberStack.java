// Jose Sierra
// CSE2 - hw07 - program #1
/* the program force the user to enter a number between 1 and 9, and then 
prints a stack of numbers depending on the number entered */

import java.util.Scanner;

public class NumberStack {                                                      // main class
    public static void main(String[] args) {                                    // main method

        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int number, count = 0;                                           // variable declaration

        System.out.print("Enter a number between 1 and 9 inclusive: ");
        if (myScanner.hasNextInt()) {                                           // the if statement makes sure an integer is entered 
            
            number = myScanner.nextInt();
            
        
            if (0 < number && number < 10) {                                    // defines the range of the accepted integers
            
                System.out.println("your number is: " + number);
                System.out.println("count= " + count);
                
            System.out.println("Using For Loops:");
                for (int i = 1; i <= number; i++) {
                    for (int k = 1; k <= i; k++) {
                        for (int j = 0; j <= count; j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                
                    for (int l = 0; l <= count; l++) {
                        System.out.print("-");
                    }
                    
                    System.out.println();
                    count += 2;
                }
                
            System.out.println("Using While Loops:");
                /* int count2=0, layer=0, n=0  ; 
                
                while (n<=number) {
                    n++;
                    layer++;
                    while (count2 <= layer) {
                        System.out.print(layer);
                        count2++;
                        
                    }
                
                }
                */ 
                
                int a =0, b=0, c=0, count2=1;
                
                
                while (a<=number){
                    while (b<=a){
                        while(c<=b){
                            System.out.print(count2);
                            c++;
                        }
                        
                        System.out.println();
                        b++;
                    }
                    System.out.println();
                    a++;
                    count2++;
                }
                
                
                
                
                 
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