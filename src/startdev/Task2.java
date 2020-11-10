/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Task 2 ------");
        int max = 10; 
        int min = 2;
        Scanner input = new Scanner (System.in); 
        System.out.println("Number from 2 to 10 was taken");
        System.out.print("Try to guess it: ");
        int userNum = input.nextInt(); 
        Random ran = new Random(); 
        int ranNum = ran.nextInt(9) + 2;
        if (ranNum == userNum) System.out.println("You won"); 
        else System.out.println("You messed up, \nThe number was " + ranNum);
        
        System.out.println("----- End Of Task 2 ------");
    }
   
}
