package src.contactlist;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 8:12 AM

ProjectName: JavaBasic2*/

import java.util.Scanner;

public class TestContact {
    public static void main(String[] args) {
        int select;
        Scanner in = new Scanner(System.in);
        Contact c1 = new Contact(1,"0987729543", "Khanh");
        Contact c2 = new Contact(2,"0355404672", "Quang Anh");
        Contact c3 = new Contact(3,"0362209689", "Kien");
        Contact c4 = new Contact(4,"001203025446", "Minh");
        Contact c5 = new Contact(5,"0934695662", "Hoang");

        ManagementContact managementContact = new ManagementContact();
        managementContact.addContact(c1);
        managementContact.addContact(c2);
        managementContact.addContact(c3);
        managementContact.addContact(c4);
        managementContact.addContact(c5);

        do {
            System.out.println("Menu: ");
            System.out.println("1. Print contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Add contact");
            System.out.println("4. Change contact");
            System.out.println("5. Exit");
            System.out.println("\nPlease select function: ");
            select = in.nextInt();
            switch (select){
                case 1: managementContact.printContact();
                    break;
                case 2: managementContact.removeContact();
                    break;
                case 3: managementContact.addContact();
                    break;
                case 4: managementContact.changeContact();
                    break;
                default: System.out.println("Succesfull!");
                    break;
            }
        }
        while (select<=4 && select>0);
    }
}
