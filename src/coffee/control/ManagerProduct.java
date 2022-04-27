package src.coffee.control;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 8:58 AM

ProjectName: JavaBasic2*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    int ne, pri;
    String na;
    Scanner in = new Scanner(System.in);
    private List<Product> products;
    public ManagerProduct(){
        this.products = new ArrayList<>();
    }
    public void addProduct(){
        System.out.println("Enter new product code: ");
        ne = in.nextInt();
        if (products.stream().allMatch(product -> product.getCode() != ne)){
            System.out.println("Enter new product name: ");
            na = in.next();
            System.out.println("Enter new product price: ");
            pri = in.nextInt();
            Product product = new Product(ne, na, pri);
            products.add(product);
        } else{
            System.out.println("Object is already exsist!");
        }
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(){
        System.out.println("Enter product code: ");
        int ne = in.nextInt();
        if(products.stream().anyMatch(product -> product.getCode() == ne)){
            for (Product product: products
                 ) {
                if (product.getCode() == ne){
                    products.remove(product);
                    System.out.println("Successfull!");
                    break;
                }
            }
        } else{
            System.out.println("Cannot found");
        }
    }
    public void changeProduct(){
        do {
            System.out.println("Enter product code: ");
            ne = in.nextInt();
            if(products.stream().anyMatch(product -> product.getCode() == ne)){
                for (Product product: products
                     ) {
                    if (product.getCode() == ne){
                        System.out.println("What do you wanna change? (press 0 to exit)");
                        System.out.println("1. Product");
                        System.out.println("2. Price");
                        System.out.println("Change: ");
                        ne = in.nextInt();
                        switch (ne){
                            case 1:
                                System.out.println("Enter new Product code: ");
                                int pro = in.nextInt();
                                product.setCode(pro);
                                break;
                            case 2:
                                System.out.println("Enter new price product: ");
                                int price = in.nextInt();
                                product.setPrice(price);
                                break;
                            default:
                                System.out.println("Cannot found!");
                        }
                    }
                }
            }
        } while (ne <=2 && ne>0);
    }

    public void printProductList(){
        for (Product product: products
             ) {
            System.out.println(product);
        }
    }
}
