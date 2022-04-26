package src.manager;/*Welcome to my show !

@author: NgKhanh
Date: 4/23/2022
Time: 3:16 PM

ProjectName: JavaBasic2*/

import java.util.*;

public class ManagementStudent {
    int rollNo;
    String name;
    String db;
    String address;
    String email;
    int status;
    int select;

    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    Scanner d = new Scanner(System.in);
    Scanner e = new Scanner(System.in);
    Scanner f = new Scanner(System.in);
    Scanner g = new Scanner(System.in);
    private List<Student> students;

    public ManagementStudent() {
        this.students = new ArrayList<>();
    }

    public void addStudent() {
        System.out.println("Enter student rollNo: ");
        rollNo = a.nextInt();
        if (students.stream().allMatch(student -> student.getRollNo() != rollNo)) {
            System.out.println("Enter student full name: ");
            name = b.next();
            System.out.println("Enter student date of birth: ");
            db = c.next();
            System.out.println("Enter student address: ");
            address = d.next();
            System.out.println("Enter student email: ");
            email = e.next();
            System.out.println("Enter student status: ");
            status = f.nextInt();
            Student student = new Student(rollNo, name, address, email, db, status);
            students.add(student);
            System.out.println("Successful!");
        }
        else {
            System.out.println("Object is already exists!");
        }
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent() {
        System.out.println("Remove student: ");
        System.out.println("Enter rollNo of student you wanna remove: ");
        rollNo = a.nextInt();
        if (students.stream().anyMatch(student -> student.getRollNo() == rollNo)) {

            for (Student student : students
            ) {
                if (student.getRollNo() == rollNo) {
                    students.remove(student);
                    System.out.println("Successful!");
                    break;
                }
            }
        } else {
            System.out.println("Cannot found!");
        }
    }

    public void listStudent() {
        for (Student student : students) {
            System.out.println("RollNo(" + student.getRollNo() + "): " + student.getFullName());
        }
    }

    public void sortStudent() {
        System.out.println("List students after sorted by full name is:");
        students.sort((st1, st2) -> st1.getFullName().compareTo(st2.getFullName()));
        students.forEach(student -> {
            System.out.println(student.getFullName());
        });
    }

    public void findStudent() {
        students.sort(Comparator.comparingInt(Student::getRollNo));

        do {
            System.out.println("Enter student rollNo :");
            System.out.println("Enter 0 to exit!");
            select = g.nextInt();
            switch (select) {
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
                    System.out.println("Successful!");
                    break;
            }
        }
        while (select <= 5 && select > 0);
    }

    public void changeStudent() {
        int change = 0;
        int num = 0;
        Scanner in = new Scanner(System.in);
            do {
                System.out.println("Enter your rollNo of student you wanna change information (press 0 to exit): ");
                num = in.nextInt();
                for (Student student: students
                     ) {
                    if (student.getRollNo() == num){
                        System.out.println("What do you want to change student information?");
                        System.out.println("1. Email");
                        System.out.println("2. Address");
                        System.out.println("3. Date of birth");
                        System.out.println("4. Status");
                        System.out.println("5. Exit");
                        System.out.println("Enter your choice:");
                        change = in.nextInt();
                        switch (change) {
                            case 1:
                                System.out.println("Enter your new email: ");
                                String em = in.next();
                                    student.setEmail(em);
                                break;
                            case 2:
                                System.out.println("Enter your new address: ");
                                String ad = in.next();
                                    student.setAddress(ad);
                                break;
                            case 3:
                                System.out.println("Enter your new date of birth: ");
                                String db = in.next();
                                    student.setDob(db);
                                break;
                            case 4:
                                System.out.println("Enter your new status: ");
                                int st = in.nextInt();
                                    student.setStatus(st);
                                break;
                            default:
                                System.out.println("Successfull!");
                                break;
                        }
                    }
                }
            }
            while(change<=4 && change>0 && num!=0);
        }
    }