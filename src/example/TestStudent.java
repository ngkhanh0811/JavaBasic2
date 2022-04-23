package src.example;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 10:56 AM

ProjectName: Java2*/

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        int check;
        Scanner a = new Scanner(System.in);
        Date d1 = new Date();
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Nguyen Ba Khanh", d1, "Ha Noi", "nguyenkhanh08112003@gmail.com", 1));
        students.add(new Student(3, "Nguyen Manh Kien", d1, "Bac Giang", "kienngu123@gmail.com", 0));
        students.add(new Student(1, "Dinh Quang Anh", d1, "Ninh Binh", "quanganh123@gmail.com", 1));
        students.add(new Student(5, "Luong Viet Hoang", d1, "Ha Long", "hoangluong123@gmail.com", 1));
        students.add(new Student(4, "Ta Van Minh", d1, "Thanh Hoa", "minhtv123@gmail.com", 1));

        students.forEach(student -> {
               System.out.println(student);
        });

        students.remove(1);
        System.out.println();

        System.out.println("List students after removed is: ");
        students.forEach(student -> {
            System.out.println(student);
        });
        System.out.println();

        students.sort(Comparator.comparingInt(Student::getRollNo));
        System.out.println("List students after sorted by rollNo is: ");
        students.forEach(student -> {
            System.out.println(student);
        });

        System.out.println("List students after sorted by full name is:");
        students.sort((st1, st2) -> st1.getFullName().compareTo(st2.getFullName()));
        students.forEach(student -> {
            System.out.println(student.getFullName());
        });

        students.add(new Student(3, "Nguyen Manh Kien", d1, "Bac Giang", "kienngu123@gmail.com", 0));
        students.sort(Comparator.comparingInt(Student::getRollNo));

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
        while (check <= 5 && check >0);{
            System.out.println("\nThe end!");
        }
    }
}
