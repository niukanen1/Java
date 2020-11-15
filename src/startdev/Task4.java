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
public class Task4 {
    public void run(){
        System.out.println("----- Task 4 ------");
        System.out.println("Create array including 10 elements of even numbers");// sdfhgsdlkjfhgsld
        int [] myArr; 
        myArr = new int[10];
        System.out.print("Array : ");
        for(int i = 0; i < myArr.length; i++){
            int x = (int) (Math.random() * 10); 
            if (x % 2 == 0) { 
                myArr[i] = x ;
            }
            System.out.print(myArr[i]);
        }
        System.out.println("\n----- End of task 4 ------");
    }
}
