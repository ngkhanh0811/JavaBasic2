package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/5/2022
Time: 8:54 AM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class SelectScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter category: ");
        String a = in.next();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from book where category = '"+ a +"'";
            System.out.println("The SQL statement is: "+ strSelect +"\n");

            ResultSet rs = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount = 0;
            while (rs.next()){
                int bookID = rs.getInt("BookID");
                String title = rs.getString("Title");
                int price = rs.getInt("Price");
                String author = rs.getString("Author");
                int qty = rs.getInt("Qty");
                int status = rs.getInt("Status");
                System.out.println(bookID + ", "+title + ", "+price+", "+author+", "+qty+", "+status);
                ++rowCount;
            } System.out.println("Total number of record = " + rowCount);
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }
}
