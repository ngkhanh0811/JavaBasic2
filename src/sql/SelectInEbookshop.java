package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/4/2022
Time: 11:44 PM

ProjectName: JavaBasic2*/

import java.sql.*;

public class SelectInEbookshop {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root", "");
                Statement stmt = conn.createStatement();
                ) {
            String strSelect = "select CategoryName from categories";
            System.out.println("The SQL statement is: " + strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount = 0;
            while (rset.next()){
                String CategoryName = rset.getString("CategoryName");
                System.out.println(CategoryName);
                ++rowCount;
            }
            System.out.println("Total number of record is: "+rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
