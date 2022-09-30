/*Created by Yagnik Ladani ID_ 21CE062
 *Generate 15 random numbers from 1 to 100 and store it in an int array.
 * Write a program to display the numbers stored at odd indexes by
 * thread1 and display numbers stored at even indexes by thread2.
 */

import java.util.*;
class odd extends Thread {
    int[] array;
    odd(int[] array) {
        this.array = array;
        start();
    }
    public void run() {
        System.out.println("odd :-");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 1) {
                System.out.println(array[j]);
            }
        }
    }
}
class even extends Thread {
    int[] array;
    even(int[] array) {
        this.array = array;
        start();
    }
    public void run() {
        System.out.println("Even :-");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0) {
                System.out.println(array[j]);
            }
        }
    }
}
class Practical6_2
{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = rand.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index" + i + " = " + arr[i]);
        }
        odd O = new odd(arr);
        even E = new even(arr);
    }
}
