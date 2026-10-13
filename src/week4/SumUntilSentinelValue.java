/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 292024
 */
public class SumUntilSentinelValue {
    
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SUM UNTIL SENTINEL VALUE
        
         Scanner sc = new Scanner(System.in);
       int num = 0; 
        int total = 0; 
        System.out.println("Enter integers (0 to stop): "); 
        while (true) { 
            num = sc.nextInt(); 
            if (num == 0) { 
                break; 
            } 
            total += num; 
        } 
        System.out.println("Final total: " + total);
    }
         
    

