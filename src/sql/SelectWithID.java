package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/5/2022
Time: 11:06 AM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class SelectWithID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Bood ID: ");
        int a = in.nextInt();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from book where bookID = '"+ a +"'";

            ResultSet rs = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount = 0;
            while (rs.next()){
                String category = rs.getString("Category");
                String title = rs.getString("Title");
                int price = rs.getInt("Price");
                String author = rs.getString("Author");
                int qty = rs.getInt("Qty");
                int status = rs.getInt("Status");
                System.out.println(category + ", "+title +", "+ category + ", "+price+", "+author+", "+qty+", "+status);
                ++rowCount;
            } System.out.println("Total number of record = " + rowCount);
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }
}

