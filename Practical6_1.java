//Created by Yagnik Ladani ID_ 21CE062
//: Write: Write a program to create thread which display “Hello World” message.
//A. by extending Thread class
//B. by using Runnable interface.

public class Practical6_1 extends Thread{
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        Practical6_1 t = new Practical6_1();
        System.out.println("Extending Thread class : ");
        t.start();

        Practical6_1 t1 = new Practical6_1();
        System.out.println("Runnable interface : ");
        Thread d = new Thread(t1);
        d.start();
    }
}
