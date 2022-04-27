package src.coffee.menu;/*Welcome to my show !

@author: NgKhanh
Date: 4/27/2022
Time: 8:28 PM

ProjectName: JavaBasic2*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementMenu {
    Scanner in = new Scanner(System.in);
    private List<Menu> menus;
    public ManagementMenu(){
        this.menus = new ArrayList<>();
    }

    public void addMenu(){
        System.out.println("Enter product code: ");
        int code = in.nextInt();
        System.out.println("Enter amount: ");
        int amount = in.nextInt();
        int price=0;
            switch (code){
                case 1: price+=amount*2;
                    break;
                case 2: price+=amount*3;
                    break;
                case 3: price+=amount*2;
                    break;
                case 4: price+=amount*4;
                    break;
                case 5: price+=amount*4;
                    break;
                case 6: price+=amount*5;
                    break;
                default:
                    System.out.println("Cannot found!");
                    break;
            }
        Menu me = new Menu(code, amount, price);
        menus.add(me);
        for (Menu menu: menus
             ) {
            if (menu.getProduct() == code){
                System.out.println("Successfull!");
                break;
            }
        }
    }

    void printList(){
        menus.forEach(menu -> {
            System.out.println(menu);
        });
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }
}
