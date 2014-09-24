// Jose Sierra
// CSE 2
// hw04 - Program #3
/* The following program reads a 6 digit number, and prints out its corresponding 
semester accordign to the lehigh university semester numbering system */


import java.util.Scanner;   // imports a user input device

// define class
public class CourseNumber{
    // define main method
    public static void main(String[] args){
        System.out.println(" "); // prints out an empty line for visual appealling
        
        // declare variables
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int courseNumber, semester, year;
    
        
        System.out.print("Enter a six digit semester course number: ");
        // check for integer input
        if (myScanner.hasNextInt()) {
            courseNumber = myScanner.nextInt();
            
            // the following determines the range for the valid input
            if (courseNumber < 186510 || courseNumber > 201440) {
                System.out.println("The number was outside the range [186510, 201440]");
            }        
            
            
            else{
                year = courseNumber/100;        // the year is determined as an integer dividing by 100
                semester = courseNumber%100;    // the semester is the residual of a division by 100
               
                // each of the following correspond to a specific semester
                if (semester == 10) {
                    System.out.println("The course was offered in Spring of "+year);
                }
                
                else if (semester == 20) {
                    System.out.println("The course was offered in Summer 1 of "+year);
                }
                
                else if (semester == 30) {
                    System.out.println("The course was offered in Summer 2 of "+year);
                }
                
                else if (semester == 40) {
                    System.out.println("The course was offered in Fall of "+year);
                }
                
                // if the input was not a legitimate semester, the program returns an error 
                else {
                    System.out.println("The input is not a legitimate semester");
                }
                
            }
            
        }
        
        // if the input was not an integer, the program returns an error
        else{
            System.out.println("The input was not a legitimate semester code");
        }
        
    System.out.println(" "); // prints out an empty line for visual appealling    
    }
}

