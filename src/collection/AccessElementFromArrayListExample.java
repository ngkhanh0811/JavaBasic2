package src.collection;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 8:39 AM

ProjectName: Java2*/

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayListExample {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>();

        System.out.println("Kien bi ngu? " + songs.isEmpty());

        songs.add("Heart Breaker");
        songs.add("Dont Forget Me");
        songs.add("Xanh");

        System.out.println("How many songs in this list? " + songs.size());

        System.out.println("The third song is: " + songs.get(2));
        System.out.println(songs);

        songs.remove(1);
        songs.remove("Around the World");

        songs.removeIf(n -> (n.charAt(1) == 'a'));

        System.out.println(songs);
    }
}
