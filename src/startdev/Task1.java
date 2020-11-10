
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */

class Task1 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("-------Task 1-------");
        System.out.print("Enter Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = (double) (celsius * 1.8 + 32);  
        System.out.println("Fahrenheit is " + fahrenheit); 
        
        System.out.println("-------End of Task 1-------"); 
    } 
}
