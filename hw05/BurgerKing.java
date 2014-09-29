// Jose Sierra
// CSE 2
// hw05 - Problem #1
/* The program prompts the user to enter a choice of burger, soda, and or fries.
 the program then details the selected choices */
 
 import java.util.Scanner;
 
 // public class as follows:
 public class BurgerKing {
    // main method as follows:
    public static void main(String[] args) {
        System.out.println(" ");        // empty line for visual appealing 
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        char order, burgerToppings, soda, fries;
        
        System.out.println("Enter a letter to indicate a choice of:");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f)    ");
        
        order = myScanner.next().charAt(0);
        
        switch(order){
            
            case 'B':
            case 'b':
                System.out.println("What would you like with your Burger?");
                System.out.println("Enter   A or a for \"all the fixins\" ");
                System.out.println("        C or c for cheese");
                System.out.print("        N or n for none of the above  ");    
                
                burgerToppings = myScanner.next().charAt(0);
                switch (burgerToppings) {
                    case 'A':
                    case 'a':
                        System.out.println("You ordered a burger with all the fixins");
                        break;    
                    case 'C':
                    case 'c':
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("You ordered a burger with none of the above");
                        break;
                    default:
                        System.out.println("A valid input was not received");
                        break;
                }
                break;
            
            case 'S':
            case 's': 
                System.out.println("What kind of soda would you like?");
                System.out.print(" Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m):    ");
                
                soda = myScanner.next().charAt(0);
                switch (soda) {
                    case 'P':
                    case 'p':
                        System.out.println("You ordered a Pepsi");
                        break;    
                    case 'C':
                    case 'c':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'S':
                    case 's':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 'M':
                    case 'm':
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                        System.out.println("A valid input was not received");
                        break;
                }
                break;
            
            case 'F':
            case 'f': 
                System.out.println("What size of fries would you like?");
                System.out.print("Large (S or s) or small (S or s):     ");
                
                fries = myScanner.next().charAt(0);
                switch (fries) {
                    case 'L':
                    case 'l':
                        System.out.println("You ordered Large fries");
                        break;    
                    case 'S':
                    case 's':
                        System.out.println("You ordered small fries");
                        break;
                    default:
                        System.out.println("A valid input was not received");
                        break;
                }
                break;
            
            
            default:
                System.out.println("A valid input was not received");
                break;
                
        }
        
        System.out.println(" ");        // empty line for visual appealing     
    }
 }