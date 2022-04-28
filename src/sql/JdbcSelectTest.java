package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 4/28/2022
Time: 8:48 AM

ProjectName: JavaBasic2*/

import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
                ) {
            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statement is: "+ strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount=0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of record = "+rowCount);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
