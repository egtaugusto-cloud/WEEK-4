/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 292024
 */
public class PatternGeneratorWithEarlyExit {
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PATTERN GENERATOR WITH EARLY EXIT
        
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  
                // this line demonstrated the continue 
            }
            for (int j = 1; j <= i; j++) {
                if (j == 4) {
                    break;
                    //this demonstes the break 
                }
                System.out.print ("*");
            }
            System.out.println();
            
            }
            }
        
        
    

