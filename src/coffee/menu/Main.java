package src.coffee.menu;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 10:54 AM

ProjectName: JavaBasic2*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner a = new Scanner(System.in);
        ManagementMenu menu = new ManagementMenu();
        do {
            System.out.println("===Menu===");
            System.out.println("1. Cappucino: 2$");
            System.out.println("2. Latte: 3$");
            System.out.println("3. Yogurt ice: 2$");
            System.out.println("4. Milk coffee(hot/ice): 4$");
            System.out.println("5. Espresso: 4$");
            System.out.println("6.Best seller - Marocchino: 5$");
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to next");
            menu.addMenu();
            i = a.nextInt();
        } while(i!=0);{
            System.out.println("End programs!");
        }
        menu.printList();
    }
}
