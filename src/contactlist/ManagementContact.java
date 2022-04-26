package src.contactlist;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 7:56 AM

ProjectName: JavaBasic2*/

import src.manager.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementContact {
    Scanner in = new Scanner(System.in);
    private int num;
    private String p;
    private String n;
    private List<Contact> contacts;
    public ManagementContact(){
        this.contacts = new ArrayList<>();
    }
    void printContact(){
        for (Contact contact: contacts
             ) {
            System.out.println(contact);
        }
    }

    void removeContact(){
        System.out.println("Enter numeric of phone: ");
        num = in.nextInt();
        if (contacts.stream().anyMatch(contact -> contact.getNumber() == num)){
            for (Contact contact: contacts
            ) {
                if (contact.getNumber() == num){
                    contacts.remove(contact);
                    break;
                }
            }
        }
    }

    void addContact(){
        System.out.println("Enter your numeric");
        num = in.nextInt();
        if(contacts.stream().allMatch(contact -> contact.getNumber() == num)){
            System.out.println("Enter your phone: ");
            p = in.next();
            System.out.println("Enter your name: ");
            n = in.next();
            System.out.println("Successful!");
            Contact contact = new Contact(num, p, n);
            contacts.add(contact);
        } else {
            System.out.println("Object is already exists!");
        }
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void changeContact() {
        int change = 0;
        int num = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter your rollNo of student you wanna change information (press 0 to exit): ");
            num = in.nextInt();
            for (Contact contact: contacts
            ) {
                if (contact.getNumber() == num){
                    System.out.println("What do you want to change student information?");
                    System.out.println("1. Phone");
                    System.out.println("2. Name");
                    System.out.println("Enter your choice:");
                    change = in.nextInt();
                    switch (change) {
                        case 1:
                            System.out.println("Enter your new email: ");
                            String em = in.next();
                            contact.setPhone(p);
                            break;
                        case 2:
                            System.out.println("Enter your new address: ");
                            String ad = in.next();
                            contact.setName(ad);
                            break;
                        default:
                            System.out.println("Successfull!");
                            break;
                    }
                }
            }
        }
        while(change<=2 && change>0 && num!=0);
    }
}
