package src.finalexam;/*Welcome to my show !

@author: NgKhanh
Date: 5/21/2022
Time: 9:32 AM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        ManagerStudent managerStudent = new ManagerStudent();
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("Menu: ");
            System.out.println("1. Add student");
            System.out.println("2. Display list");
            System.out.println("3. Save student");
            System.out.println("4. Print collection list");
            System.out.println("5. Exit");
            do{
                System.out.println("Select: ");
                select = in.nextInt();
            switch (select){
                case 1: managerStudent.addStudents();
                break;
                case 2: managerStudent.display();
                break;
                case 3: managerStudent.saveStudents();
                break;
                case 4: managerStudent.printList();
                break;
                case 5: System.out.println("Exit successful!");
                break;
                default:
                    System.out.println("Cannot found!");
                    break;
                }
            } while (select != 5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
