// Jose Sierra
// CSE 2
// lab 2
// Sept/05/2014
//
//
// Cyclometer measures speed, distance, and time. Records the time elapsed in seconds
// and the number of rotations of the front wheel of the bycicle during that time. 

public class Cyclometer {
    //  main method required for every java program
    public static void main(String[] args) {
        // variables:
        int secsTrip1=480;      // time for trip 1
        int secsTrip2=3220;     // time for trip 2
        int countsTrip1=1561;   // rotations for trip 1
        int countsTrip2=9037;   // rotations for trip 2
        
        // intermediate variables and output data
        double wheelDiameter=27.0,  // wheel diameter
        PI=3.14159,                 // the number PI
        feetPerMile=5280,           // feet per mile
        inchesPerFoot=12,           // inches per foot
        secondsPerMinute=60;        // seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; // distances for trips 1, 2, and total
        
        //
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
        // run the calculations; store the values
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        
        distanceTrip1/=inchesPerFoot*feetPerMile;   // gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        // pritn out the output data
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } // end of main method
    
}

