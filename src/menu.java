package src;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 10:54 AM

ProjectName: JavaBasic2*/

import java.util.Scanner;

public class menu {
        public static void main(String[] args) {
            int i, cp=0, lt=0, yg=0, mc=0, es=0, mr=0, amount;
            Scanner a = new Scanner(System.in);
            do {
                System.out.println("===Menu===");
                System.out.println("1. Cappucino: 2$");
                System.out.println("2. Latte: 3$");
                System.out.println("3. Yogurt ice: 2$");
                System.out.println("4. Milk coffee(hot/ice): 4$");
                System.out.println("5. Espresso: 4$");
                System.out.println("6.Best seller - Marocchino: 5$");
                System.out.println("Press 0 to exit");
                System.out.println("What do you want?");
                i = a.nextInt();
                switch (i) {
                    case 0 -> System.out.println();
                    case 1 -> {
                        System.out.println("Enter amount: ");
                        amount = a.nextInt();
                        cp += amount;
                        System.out.println("Successfull!");
                    }
                    case 2 -> {
                        System.out.println("Enter amount: ");
                        amount = a.nextInt();
                        lt += amount;
                        System.out.println("Successfull!");
                    }
                    case 3 -> {
                        System.out.println("Enter amount: ");
                        amount = a.nextInt();
                        yg += amount;
                        System.out.println("Successfull!");
                    }
                    case 4 -> {
                        System.out.println("Enter amount: ");
                        amount = a.nextInt();
                        mc += amount;
                        System.out.println("Successfull!");
                    }
                    case 5 -> {
                        System.out.println("Enter amount: ");
                        amount = a.nextInt();
                        es += amount;
                        System.out.println("Successfull!");
                    }
                    case 6 -> {
                        System.out.println("Enter amount: ");
                        amount = a.nextInt();
                        mr += amount;
                        System.out.println("Successfull!");
                    }
                    default -> System.out.println("Cannot found");
                }
            } while (i <=6 && i>0);
            System.out.println("Bill: ");
            System.out.println("Cappucino: "+cp+ " = " +cp*2 +"$");
            System.out.println("Latte: "+lt+ " = " +lt*3+"$");
            System.out.println("Yogurt ice: "+yg+ " = " +yg*2+"$");
            System.out.println("Milk coffee: "+mc+ " = " +mc*4+"$");
            System.out.println("Espresso: "+es+ " = " +es*4+"$");
            System.out.println("Marocchino: "+mr+ " = " +mr*5+"$");
            double total = cp * 2 + lt * 3 + yg * 2 + mc * 4 + es*4 + mr * 5;
            System.out.println("Total: "+total+"$");
        }
}
