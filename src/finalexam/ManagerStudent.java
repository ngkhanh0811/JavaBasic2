package src.finalexam;/*Welcome to my show !

@author: NgKhanh
Date: 5/21/2022
Time: 9:05 AM

ProjectName: JavaBasic2*/

import src.manager.ManagementStudent;
import src.manager.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {
    Scanner in = new Scanner(System.in);
    private List<Students> students;

    public ManagerStudent() {
        this.students = new ArrayList<>();
    }

    void addStudents() {
        System.out.println("Enter new Student ID: ");
        String id = in.next();
        if (students.stream().allMatch(student -> student.getStudentID() != id)) {
            System.out.println("Enter new student name: ");
            String name = in.next();
            System.out.println("Enter new student address");
            String ad = in.next();
            System.out.println("Enter new student phone: ");
            String ph = in.next();
            Students stu = new Students(id, name, ad, ph);
            students.add(stu);
        } else {
            System.out.println("Student id is already exists !");
        }
    }

    void addStudents(Students student) {
        students.add(student);
    }

    void printList(){
        students.forEach(students1 -> {
            System.out.println(students1);
        });
    }

    public List<Students> getStudentList() {
        return students;
    }

    void saveStudents() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        ) {
            ManagementStudent managementStudent = new ManagementStudent();
            System.out.println("You choosed saving the student records!");
            List<Students> listStudent = getStudentList();
            String saveStudent = "INSERT INTO Student(studentID, studentName, address, phone) VALUES (?, ?, ?,?);";
            PreparedStatement pstmt = conn.prepareStatement(saveStudent);
            int count = 0;
            for (Students student : students) {
                pstmt.setString(1, student.getStudentID());
                pstmt.setString(2, student.getStudentName());
                pstmt.setString(3, student.getAddress());
                pstmt.setString(4, student.getPhone());
                pstmt.executeUpdate();
                ++count;
            }
            System.out.println(count + "records saved!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        void display() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("select * from Student");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numcolumn = rsetMD.getColumnCount();

            for (int i = 1; i <= numcolumn; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numcolumn; i++) {
                System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numcolumn; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
