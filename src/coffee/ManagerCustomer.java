package src.coffee;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 8:58 AM

ProjectName: JavaBasic2*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    Scanner in = new Scanner(System.in);
    private int num;
    private String name;
    private List<Customer> customers;
    public ManagerCustomer(){
        this.customers = new ArrayList<>();
    }

    void listCustomer(){
        for (Customer customer: customers
             ) {
            System.out.println(customer);
        }
    }

    void addCustomer(Customer customer){
        customers.add(customer);
    }

    void addCustomer(){
        System.out.println("Enter new customer number: ");
        num = in.nextInt();
        if (customers.stream().allMatch(customer -> customer.getNumber() != num)){
            System.out.println("Enter customer name: ");
            name = in.next();
            Customer customer = new Customer(num, name);
            customers.add(customer);
        } else{
            System.out.println("Customer is already exists!");
        }
    }

    void removeCustomer(){
        System.out.println("Remove customer: ");
        num = in.nextInt();
        if (customers.stream().anyMatch(customer -> customer.getNumber() != num)){
            for (Customer customer: customers
                 ) {
                if (customer.getNumber() == num){
                    customers.remove(customer);
                    System.out.println("Successfull!");
                    break;
                }
            }
        } else{
            System.out.println("Cannot found!");
        }
    }

    void changeCustomer(){
        do {
            System.out.println("Enter customer number: (press 0 to exit)");
            num = in.nextInt();
            for (Customer customer: customers
                 ) {
                if (customer.getNumber() == num){
                    System.out.println("What do you wanna change?");
                    System.out.println("1. Name");
                    System.out.println("2. Number");
                    num = in.nextInt();
                    switch (num){
                        case 1:
                            System.out.println("Enter new customer name: ");
                            String n = in.next();
                            customer.setName(n);
                            break;
                        case 2:
                            System.out.println("Enter new number customer: ");
                            int nu = in.nextInt();
                            customer.setNumber(nu);
                            break;
                        default:
                            System.out.println("Cannot found!");
                            break;
                    }
                }
            }
        }
        while (num <=2 && num >0);{
            System.out.println("Successfull!");
        }
    }
}
