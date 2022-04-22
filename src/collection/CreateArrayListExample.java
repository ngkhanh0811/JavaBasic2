package src.collection;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 8:15 AM

ProjectName: Java2*/

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Kien1");
        animals.add("Kien2");
        animals.add("Kien3");
        animals.add("Kien4");

        System.out.println(animals);

        animals.add(3, "Dog");

        System.out.println(animals);
    }
}
