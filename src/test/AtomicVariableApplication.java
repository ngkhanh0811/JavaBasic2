package src.test;/*Welcome to my show !

@author: NgKhanh
Date: 5/19/2022
Time: 4:24 PM

ProjectName: JavaBasic2*/

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableApplication {
    private final AtomicInteger value = new AtomicInteger(0);
    public int getValue(){
        return value.get();
    }
    public int getNextValue(){
        return value.incrementAndGet();
    }
    public int getPreviousValue(){
        return value.decrementAndGet();
    }

    public static void main(String[] args) {
        AtomicVariableApplication obj = new AtomicVariableApplication();
        System.out.println(obj.getValue());
        System.out.println(obj.getNextValue());
        System.out.println(obj.getPreviousValue());
    }
}
