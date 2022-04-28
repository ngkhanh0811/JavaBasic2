package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 4/28/2022
Time: 11:07 AM

ProjectName: JavaBasic2*/

import java.sql.*;

public class SelectByName {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select title, price from books where author = 'Oda'";
            System.out.println("The SQL statement is: "+ strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount=0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                System.out.println(title + ", " + price);
                ++rowCount;
            }
            System.out.println("Total number of record = "+rowCount);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
