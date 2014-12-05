// Jose Sierra
// CSE2 - hw11 
// Poker Hands 
/*  RANK OF WINNING: 
    ROYAL FLUSH: straight flush of the form A, K, Q, J, 10
    FOUR OF A KIND: four of the same type
    FULL HOUSE: Three of a kind and one pair 
    FLUSH: Five cards of the same suit
    STRAIGHT: Five cards which ranks are sequentially 
    TWO PAIR: tow pairs 
    ONE PAIR: one pair
    HIGH CARD:  highest ranked card 
*/ 

import java.util.Scanner;

public class PokerHands {
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in); 
        
        System.out.println("Enter y or Y to enter another hand: ");
        if (myScanner.hasNext()) {
            
            if (myScanner.hasNext("y")) {
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's': ");
                String suit = myScanner.nextLine();
                System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': ");
                String type = myScanner.nextLine();
                
                
            
            
            
            }
            
        
            
            
            else {
                 System.out.println("fail");
            }
         
        }   
            
            
        
    }
    
    public static void showOneHand(int hand[]) {
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={ "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }

    
    
}
