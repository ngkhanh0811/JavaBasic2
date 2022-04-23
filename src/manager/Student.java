package src.manager;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 10:46 AM

ProjectName: Java2*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int rollNo;
    private String fullName;
    private String dob;
    private String address;
    private String email;
    private int status;
    public Student(int rollNo, String fullName, String dob, String address, String email, int status){
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.status = status;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", fullName='" + fullName + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
