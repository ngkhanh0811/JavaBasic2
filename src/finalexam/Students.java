package src.finalexam;/*Welcome to my show !

@author: NgKhanh
Date: 5/21/2022
Time: 8:57 AM

ProjectName: JavaBasic2*/

public class Students {
    String StudentID;
    String StudentName;
    String Address;
    String Phone;
    public Students(String stuID, String stuName, String ad, String ph){
        this.StudentID = stuID;
        this.StudentName = stuName;
        this.Address = ad;
        this.Phone = ph;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        this.StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
