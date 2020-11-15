/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

import static java.lang.Character.*;

/**
 *
 * @author user
 */
public class Task7 {
    public void run(){
        System.out.println("----- Task 7 ------");
        
        System.out.print("Enter a string: ");
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        letter = toLowerCase(letter);
        
        char[] strArr = new char[str.length()] ; 
        int count = 0; 
        for (int i = 0; i < strArr.length; i++) { 
            strArr[i] = str.charAt(i); 
            if (strArr[i] == letter) count++; 
        }
        
        System.out.println("Letter " + letter + " was " + count + " times in your string" );
        System.out.println("----- end of task 7 ------");
    }
}
