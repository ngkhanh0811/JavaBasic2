package src.manager;/*Welcome to my show !

@author: NgKhanh
Date: 4/23/2022
Time: 3:37 PM

ProjectName: JavaBasic2*/

import java.util.Date;
import java.util.Scanner;


public class TestManager {
    public static void main(String[] args) {
        int a;
        Scanner i = new Scanner(System.in);
        Student student1 = new Student(2, "Nguyen Ba Khanh", "08/11/2003/", "Ha Noi", "nguyenkhanh08112003@gmail.com", 1);
        Student student2 = new Student(3, "Nguyen Manh Kien", "31/2/2003", "Bac Giang", "kienngu123@gmail.com", 0);
        Student student3 = new Student(1, "Dinh Quang Anh", "8/3/1999", "Ninh Binh", "quanganh123@gmail.com", 1);
        Student student4 = new Student(5, "Luong Viet Hoang", "12/2/2003", "Ha Long", "hoangluong123@gmail.com", 1);
        Student student5 = new Student(4, "Ta Van Minh", "15/4/2003", "Thanh Hoa", "minhtv123@gmail.com", 1);

        ManagementStudent managementStudent = new ManagementStudent();
        managementStudent.addStudent(student1);
        managementStudent.addStudent(student2);
        managementStudent.addStudent(student3);
        managementStudent.addStudent(student4);
        managementStudent.addStudent(student5);

        System.out.println("Menu: ");
        System.out.println("1. View student list");
        System.out.println("2. Remove student information");
        System.out.println("3. Add student information");
        System.out.println("4. Change student information");
        System.out.println("5. Sort students by name A-Z");
        System.out.println("6. Looking for student");
        System.out.println("7. Exit");

        do {
            System.out.println("\nPlease select function: ");
            a = i.nextInt();
            switch (a){
                case 1: managementStudent.listStudent();
                    break;
                case 2: managementStudent.removeStudent();
                    break;
                case 3: managementStudent.addStudent();
                    break;
                case 4: managementStudent.changeStudent();
                    break;
                case 5: managementStudent.sortStudent();
                    break;
                case 6: managementStudent.findStudent();
                    break;
                default: System.out.println("Succesfull!");
                    break;
            }
        }
        while (a<=6 && a>0);{

        }
    }
}
