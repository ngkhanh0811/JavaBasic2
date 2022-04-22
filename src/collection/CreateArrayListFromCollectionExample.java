package src.collection;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 8:28 AM

ProjectName: Java2*/

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(81);
        number.add(2003);

        List<Integer> nextNumber = new ArrayList<>();
        nextNumber.add(13);
        nextNumber.add(03);
        nextNumber.add(2022);

        number.addAll(nextNumber);
        System.out.println(number);
    }
}
