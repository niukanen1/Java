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
public class Task6 {
    public void run(){
        System.out.println("----- Task 6 ------");
        System.out.println("");
        int[][] myArr; 
        int x = 10; 
        myArr = new int[10][9];
        for (int i = 0; i < myArr.length; i++){
            x--;
            System.out.println("\n");
            for (int j = 0; j < x; j++){
                myArr[i][j] = (int) (Math.random() * 10); 
                myArr[i][j] = (int) (Math.random() * 10);
                System.out.print(myArr[i][j]);
            }
        }
        System.out.println("\n----- end of Task 6 ------");
    }
}
