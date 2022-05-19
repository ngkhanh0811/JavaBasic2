package src.test;/*Welcome to my show !

@author: NgKhanh
Date: 5/19/2022
Time: 3:53 PM

ProjectName: JavaBasic2*/

public class ThreadDemo implements Runnable{
    String name;
    Thread objTh;
    ThreadDemo(String str){
        name = str;
        objTh = new Thread(this, name);
        System.out.println("New Threads are starting: "+objTh);
        objTh.start();
    }
    public void run(){
        try{
            for (int count = 0; count<2;count++){
                System.out.println(name+":"+count);
                objTh.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(name + "interrupted");
        }
        System.out.println(name + "exiting");
    }

    public static void main(String[] args) {
        ThreadDemo objNew1 = new ThreadDemo("one");
        ThreadDemo objNew2 = new ThreadDemo("two");
        ThreadDemo objNew3 = new ThreadDemo("three");
        System.out.println("First thread is alive:" + objNew1.objTh.isAlive());
        System.out.println("Second thread is alive:" + objNew2.objTh.isAlive());
        System.out.println("Third thread is alive:" + objNew3.objTh.isAlive());
        try{
            System.out.println("In the main method, waiting for the threads to finish");
            objNew1.objTh.join();
            objNew2.objTh.join();
            objNew3.objTh.join();
        } catch (InterruptedException e){
            System.out.println("Main thread is interrupted");
            System.out.println("First thread is alive:"+objNew1.objTh.isAlive());
            System.out.println("Second thread is alive:"+objNew2.objTh.isAlive());
            System.out.println("Third thread is alive:"+objNew3.objTh.isAlive());
            System.out.println("Main thread is over and exiting");
        }
    }
}
