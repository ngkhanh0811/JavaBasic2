package src.coffee.control;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 10:40 AM

ProjectName: JavaBasic2*/

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Customer c1 = new Customer(1,"Khanh");
        Product p1 = new Product(1,"Capuccino",2);
        Product p2 = new Product(2, "Latte", 3);
        Product p3 = new Product(3,"Yogurt ice", 2);
        Product p4 = new Product(4,"Milk coffee(hot/ice)", 4);
        Product p5 = new Product(5,"Espresso",4);
        Product p6 = new Product(6,"Marocchino",5);
        ManagerCustomer managerCustomer = new ManagerCustomer();
        managerCustomer.addCustomer(c1);
        ManagerProduct managerProduct = new ManagerProduct();
        managerProduct.addProduct(p1);
        managerProduct.addProduct(p2);
        managerProduct.addProduct(p3);
        managerProduct.addProduct(p4);
        managerProduct.addProduct(p5);
        managerProduct.addProduct(p6);


        int select;
        do {
            System.out.println("1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("3. Print customer list");
            System.out.println("4. Change customer information");
            System.out.println("---------");
            System.out.println("5. Add product");
            System.out.println("6. Remove product");
            System.out.println("7. Print product list");
            System.out.println("8. Change product information");
            select = a.nextInt();
            switch(select) {
                case 1: managerCustomer.addCustomer();
                    break;
                case 2: managerCustomer.removeCustomer();
                    break;
                case 3: managerCustomer.listCustomer();
                    break;
                case 4: managerCustomer.changeCustomer();
                    break;
                case 5: managerProduct.addProduct();
                    break;
                case 6: managerProduct.removeProduct();
                    break;
                case 7: managerProduct.printProductList();
                    break;
                case 8: managerProduct.changeProduct();
                    break;
                default: System.out.println("Cannot found!");
                    break;
            }
        } while (select<=8 && select>0);
    }
}
