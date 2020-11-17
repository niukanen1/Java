/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author user
 */
public class StartDev {




    public static void PauseBeforeGoOn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Press any key to continue");
        input.nextLine();
    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();

        task6.run();

//        PauseBeforeGoOn();
//        task1.run();
//
//        PauseBeforeGoOn();
//        task2.run();
//
//        PauseBeforeGoOn();
//        task3.run();
//
//        PauseBeforeGoOn();
//        task4.run();
//
//        PauseBeforeGoOn();
//        task5.run();
//
//        PauseBeforeGoOn();
//        task6.run();
//
//        PauseBeforeGoOn();
//        task7.run();


    }
}