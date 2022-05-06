package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/5/2022
Time: 11:17 AM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class SelectOrderWithCusID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Customer ID: ");
        int a = in.nextInt();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from Orders where cusID = '"+ a +"'";

            ResultSet rs = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount = 0;
            while (rs.next()){
                int orderID = rs.getInt("orderID");
                String cusName = rs.getString("cusName");
                int cusID = rs.getInt("cusID");
                String dateOrder = rs.getString("dateOrder");
                int status = rs.getInt("status");
                System.out.println(orderID+ ", "+cusName + ", "+cusID+", "+dateOrder+", "+status);
                ++rowCount;
            } System.out.println("Total number of record = " + rowCount);
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }
}
