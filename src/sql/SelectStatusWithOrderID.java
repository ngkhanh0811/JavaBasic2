package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/5/2022
Time: 11:21 AM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class SelectStatusWithOrderID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Order ID: ");
        int a = in.nextInt();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from orders where orderID = '"+ a +"'";

            ResultSet rs = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount = 0;
            while (rs.next()){
                int status = rs.getInt("status");
                System.out.println("Status of product is: " + status);
                ++rowCount;
            } System.out.println("Total number of record = " + rowCount);
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }
}
