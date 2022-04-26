package src.coffee;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 8:57 AM

ProjectName: JavaBasic2*/

import java.util.ArrayList;
import java.util.List;

public class Customer {
    int number;
    String name;
    public Customer(int number, String name){
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
