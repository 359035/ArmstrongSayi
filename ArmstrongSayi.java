/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armstrongsayi;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class ArmstrongSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Sayi Giriniz:");
        int number=scan.nextInt();
        int basNumber=0,total=0;
        
        while(number!=0){
            basNumber=number%10;
            total+=basNumber;
            number/=10;
            
            
        }
        System.out.println("Rakamlarin Toplami:"+total);
        
    }
    
}
