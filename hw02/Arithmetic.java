// Jose Sierra
// CSE2
// hw02
// sep/9/2014
//

// class define
public class Arithmetic{
    //main method
    public static void main(String[] args) {
        // number of pairs of socks
        int nSocks=3;
        //cost per pair of socks '$' is part of the variable name
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        // PA Sales Tax
        double taxPercent=0.06;
        
        // variables for calculations
        double totalSockCost$=nSocks*sockCost$;             // total cost of socks
        double totalGlassesCost$=nGlasses*glassCost$;       // total cost of glasses
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$; // total cost of envelopes
        
        double preTotal$=totalSockCost$+totalGlassesCost$+totalEnvelopeCost$;   // Total before taxes
        
        double purchaseTax$=preTotal$*taxPercent;   // taxes to pay for current purchase
        
        double itemTaxSocks=(int)(totalSockCost$*taxPercent*100)/100.0; // tax for individual item
        double itemTaxGlasses=(int)(totalGlassesCost$*taxPercent*100)/100.0;
        double itemTaxEnvelope=(int)(totalEnvelopeCost$*taxPercent*100)/100.0;
        
        // tax for the current purchase only two decimals
        double tax$=(int)((itemTaxSocks+itemTaxGlasses+itemTaxEnvelope)*100)/100.0;
       
       
        double total$=preTotal$+tax$;
        
        
        
        // the program displays the details of the purchase
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("You are purchasing today:");
        System.out.println(" ");
        System.out.println(nSocks+" pairs of socks @ $"+sockCost$);
        System.out.println("$"+totalSockCost$); 
        System.out.println("Tax for these items: $"+itemTaxSocks);
        System.out.println(" ");
        
        System.out.println(nGlasses+" Glasses @ $"+glassCost$);
        System.out.println("$"+totalGlassesCost$);
        System.out.println("Tax for these items: $"+itemTaxGlasses);
        System.out.println(" ");
        
        System.out.println(nEnvelopes+" Envelopes @ $"+envelopeCost$);
        System.out.println("$"+totalEnvelopeCost$);
        System.out.println("Tax for these items: $"+itemTaxEnvelope);
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Total before Tax: $"+preTotal$);
        System.out.println("Tax: $"+tax$);
        System.out.println(" ");
        
        System.out.println("Your Total is: $"+total$);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" THANKS FOR SHOPPING WITH US! ");
        System.out.println(" ");
        System.out.println(" ");
        
        
        // end of the program
        
    }
}
