// Jose Sierra
// CSE2 - lab05
/* RandomGames.java uses the Scanner function to obtain from the user a choice of 3 games: 
(1) Roulette, (2) Craps, (3) Picking Cards. */


import java.util.Scanner;

// class
public class RandomGames {
    // main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        String game; 
        
        System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for pick a card ");
        if (myScanner.hasNextChar()) {
            game = myScanner.nextChar();
            System.out.println(game);
            
        }
    
        
    
    
       
        
        
        
    }
        
        
    
}