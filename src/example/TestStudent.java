package src.example;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 10:56 AM

ProjectName: Java2*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        int check;
        Scanner a = new Scanner(System.in);
        Date d1 = new Date();
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Ba Khanh", d1, "Ha Noi", "nguyenkhanh08112003@gmail.com", 1));
        students.add(new Student(2, "Nguyen Manh Kien", d1, "Bac Giang", "kienngu123@gmail.com", 0));
        students.add(new Student(3, "Dinh Quang Anh", d1, "Ninh Binh", "quanganh123@gmail.com", 1));
        students.add(new Student(4, "Luong Viet Hoang", d1, "Ha Long", "hoangluong123@gmail.com", 1));
        students.add(new Student(5, "Ta Van Minh", d1, "Thanh Hoa", "minhtv123@gmail.com", 1));

/*      students.forEach(student -> {
           if (student.getRollNo() == 1) {
               System.out.println(student);
           }
        });*/
        do {
            System.out.println("\nEnter student rollNo :");
            check = a.nextInt();
            switch (check) {
                case 1:
                    System.out.println(students.get(0));
                    break;
                case 2:
                    System.out.println(students.get(1));
                    break;
                case 3:
                    System.out.println(students.get(2));
                    break;
                case 4:
                    System.out.println(students.get(3));
                    break;
                case 5:
                    System.out.println(students.get(4));
                    break;
                default:
                    System.out.println("Undefine!");
                    break;
            }
        }
        while (check <= 5);{
            System.out.println();
        }
    }
}
