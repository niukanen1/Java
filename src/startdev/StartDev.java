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
        System.out.println("Pressing 1 to 7 starting exact task \nPress 0 to quit ");

    }


        public void run() {

            Task1 task1 = new Task1();
            Task2 task2 = new Task2();
            Task3 task3 = new Task3();
            Task4 task4 = new Task4();
            Task5 task5 = new Task5();
            Task6 task6 = new Task6();
            Task7 task7 = new Task7();

            boolean isRunning = true;
            int user;
            Scanner input = new Scanner(System.in);
            do {
                PauseBeforeGoOn();
                user = input.nextInt();

                switch (user) {
                    case 0:
                        System.out.println("Quiting Startdev...");
                        isRunning = false;
                        break;
                    case 1:
                        task1.run();
                        break;
                    case 2:
                        task2.run();
                        break;
                    case 3:
                        task3.run();
                        break;
                    case 4:
                        task4.run();
                        break;
                    case 5:
                        task5.run();
                        break;
                    case 6:
                        task6.run();
                        break;
                    case 7:
                        task7.run();
                        break;
                }
            } while(isRunning);
        }
}