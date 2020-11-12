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
public class StartDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Task1 task1 = new Task1();
       Task2 task2 = new Task2();
       Task3 task3 = new Task3();
       Task4 task4  = new Task4();
       Task5 task5 = new Task5(); 
       Task6 task6 = new Task6();
       Task7 task7 =  new Task7();
       
       task1.run();
       
       
       task2.run();
       Scanner input = new Scanner(System.in); 
       if (input.hasNext()) task3.run();
          
         

          
         task4.run(); 

            
            task5.run(); 

            
           task6.run();

             
            task7.run();
    }
    
}
