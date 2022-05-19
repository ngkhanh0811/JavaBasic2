package src.test;/*Welcome to my show !

@author: NgKhanh
Date: 5/19/2022
Time: 4:09 PM

ProjectName: JavaBasic2*/

import java.io.IOException;

public class Chopstick {
    boolean available;
    Chopstick(){
        this.available = true;
    }
    public synchronized void takeUp(){
        while(!available){
            try{
                System.out.println("Waiting to eat...");
                wait();
            } catch (InterruptedException e){}
        }
        available = false;
    }
    public synchronized void putDown(){
        available = true;
    }
}
class Philosopher extends Thread{
    Chopstick left;
    Chopstick right;
    int ID;
    public Philosopher(Chopstick left, Chopstick right, int ID){
        this.left = left;
        this.right = right;
        this.ID = ID + 1;
    }

    public void eat(){
        left.takeUp();
        right.takeUp();
        System.out.println(ID+" :The Philosopher is Dining");
    }

    public void think(){
        left.putDown();
        right.putDown();
        System.out.println(ID+": The Philosopher is Thinking");
    }
    public void run(){
        while(true){
            eat();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            think();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ee){
            }
        }
    }
}

class DiningDemo{
    public static void main(String[] args) throws IOException {
        int i;
        Philosopher[] philosophers = new Philosopher[5];
        Chopstick[] chopsticks = new Chopstick[5];
        for (i=0;i<5;i++){
            chopsticks[i] = new Chopstick();
        }
        for (i=0;i<5;i++){
            philosophers[i] = new Philosopher(chopsticks[i],chopsticks[(i+1)%5],i);
        }
        for (i=0;i<5;i++){
            philosophers[i].start();
        }
    }
}
