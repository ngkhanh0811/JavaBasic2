package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/7/2022
Time: 9:07 PM

ProjectName: JavaBasic2*/

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
                ){
            String strSelect = "select title from book";
            System.out.println("The SQL statement is: "+ strSelect + "\n");

            ResultSet rs = stmt.executeQuery(strSelect);
            int rowCount=0;
            while (rs.next()){
                String title = rs.getString("Title");
                System.out.println(title);
                ++rowCount;
            }
            System.out.println("The record is: "+rowCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
