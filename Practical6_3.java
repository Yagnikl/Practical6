/*
   Created by Yagnik Ladani ID_ 21CE062
    Aim  : Write a program to increment the value of one variable by one and display it after one second using thread using sleep() method.
*/
import java.util.*;
public class Practical6_3 {
    public static void main(String[] args)  {
        int var;
        for (var = 1; var<= 10; var++) {
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.print(var + " ");
        }
    }
}
