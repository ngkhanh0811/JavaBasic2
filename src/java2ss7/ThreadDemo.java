package src.java2ss7;/*Welcome to my show !

@author: NgKhanh
Date: 5/19/2022
Time: 3:48 PM

ProjectName: JavaBasic2*/

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        ThreadDemo objTh = new ThreadDemo();
        Thread t = new Thread(objTh);
        try {
            t.start();
            System.out.println("Number of threads running:"+ Thread.activeCount());
            System.out.println("I am in the main and waiting for the thread to finish");
            objTh.join();
        } catch (InterruptedException e){
            System.out.println("Main thread is interrupted");
        }
    }
}
