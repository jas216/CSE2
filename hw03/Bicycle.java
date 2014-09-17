// Jose Sierra
// CSE 2
// hw 03 - Program #1 Bicycle.java 
// The following program receives input from the user in order to 
// print distance traveled and average miles per hour, for cyclometer 
// with wheel diameter 27 in 

//needed input: a: number of counts
//              b: time (in seconds) 
// Calculates:  c: distance travled (miles)
//              d: avg miles per hour

// import scanner: 
import java.util.Scanner; 

public class Bicycle {
    // main method:
    public static void main(String[] args) {
        
        // print out one line, just for visual appealing
        System.out.println(" ");
        
        Scanner myScanner;  // define the input device
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of counts (as an integer): "); // input for number of counts
        int counts = myScanner.nextInt();
        
        System.out.print("Enter the time elapsed (an integer in seconds) : "); // input for time in seconds
        int seconds = myScanner.nextInt();
        
        // intermediate variables and output data
        double wheelDiameter=27.0,  // wheel diameter
        PI=3.14159,                 // the number PI
        inchesPerMile=63360,           // inches per mile
        secondsPerHour=3600;        // seconds per hour
        
        // calculate distance traveled in miles
        double distance = counts*wheelDiameter*PI/inchesPerMile;
        double intDistance = (int)(distance*100)/100.0;
        
        // convert seconds to hours
        double timeHours = seconds/secondsPerHour;
        double timeMinutes = seconds/60;
        double intTimeMinutes = (int)(timeMinutes*100)/100.0;
        
        // calculate average miles per hour
        double milesPerHour= distance/timeHours;
        double intMilesPerHour = (int)(milesPerHour*100)/100.0;
        
        
        System.out.println("Your distance traveled (in miles) is: "+intDistance+ " miles and took "+intTimeMinutes+" minutes");
        System.out.println("The average MPH was "+intMilesPerHour);
        
        System.out.println(" "); // print lines just for visual apppealing 
        System.out.println(" "); 
    }
    
    // end of main method
} 

// end of program
