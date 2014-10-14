// Jose Sierra
// CSE2 hw06 - Program #1
// Roulette.java
/* This program simulates a roulette game, selecting a random number to place a bet
on the same number for 100 spins (a game), and repeating the procudure 1000 times (whith 1000
randomly selected myNumber). The program then counts --out of the 1000 100-spins repetitions--
(1)The number of of times of a complete loss myNumber never comes up, (2)The total number of winnings, (3)The number 
of games (100-spins) that there was a profit (at least 3 winns) */ 


//main class:
public class Roulette {
    
    //main method:
    public static void main(String[] args) {
    System.out.println(" ");                            // print empty line for visual appealing
    
    // declaration of main variables
    int gameNumber=0, wins=0, gameProfits=0, completeLoss=0; 
    
        //main while loop for the monte carlo simulation
        while (gameNumber < 1000){                      // game plays 1000 times
            //to randomly select the number to be played:
            double x = Math.random();                   // for each game a different myNumber is randomly chosen
            int myNumber = (int)(x*38 + 1);
            
            int spin=0, success=0; 
            
                // inner while loop for each game            
                while (spin < 100) {                    // roulette spins 100 times 
                    double a = Math.random();
                    int b = (int)(a*38 + 1);
                    
                    if (b==myNumber){                   // counts the number of success
                        success++;                      // successes increases by 1
                        //System.out.println(success);
                        wins++;                         // wins increases by 1
                    }
                    spin++;                             // spin increases by 1
                }
                
            if (success>=3){                             // for a win to have at least 3 successes
                gameProfits++;
            }
            else if (success==0){
                completeLoss++;
            }
            gameNumber++;                               // game number counter increases by 1 
        }
        
    System.out.println("The number of games (100-spins) that myNumber never came up (lost everything): ");
    System.out.println(completeLoss+ " out of 1000 games");
    System.out.println("The number of winnings (myNumber comes up): ");
    System.out.println(wins+ " out of 100,000 spins");
    System.out.println("The number of games (100-spins) in which there was a profit is: ");
    System.out.println(gameProfits+ " out of 1000 games");
        
    
    System.out.println(" ");                            // print empty line for visual appealing
    }
}