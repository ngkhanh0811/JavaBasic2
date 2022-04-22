package example;/*Welcome to my show !

@author: NgKhanh
Date: 4/21/2022
Time: 10:46 AM

ProjectName: Java2*/

import java.util.Date;

public class Student {
    private int rollNo;
    private String fullName;
    private Date dob;
    private String address;
    private String email;
    private int status;
    public Student(int rollNo, String fullName, Date dob, String address, String email, int status){
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

    public Date getDob(){
        return dob;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getStatus() {
        return status;
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
