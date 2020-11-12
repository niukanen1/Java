/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

/**
 *
 * @author user
 */
public class Task3 {
    public void run(){
        int sum = 0; 
        int max = 0; 
        int min = 10; 
        System.out.println("----- Task 3 ------\n");
        
        int[] myArr;
        myArr = new int[10];
        
        for (int i = 0; i < myArr.length; i++ ) {
            myArr[i] = (int) (Math.random() * 10);
        }
        // array print 
        System.out.print("Array is : " );
        for (int i = 0; i <myArr.length; i++ ) {
            System.out.print (myArr[i]);
            
            if (myArr[i] > max) max = myArr[i]; 
            if (myArr[i] < min) min = myArr[i]; 
            sum += myArr[i];
        }
        
        
        System.out.println("\nSum of all el in array: " + sum);
        System.out.println("Max of Array is : " + max);
        System.out.println("min of Array is : " + min);
        System.out.println("\n----- End of Task 3 ------");
    }
}
