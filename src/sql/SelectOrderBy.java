package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 4/28/2022
Time: 11:04 AM

ProjectName: JavaBasic2*/

import java.sql.*;

public class SelectOrderBy {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select title,author, price, qty from books where author = 'Oda' and price >= 30 order by price desc, id asc";
            System.out.println("The SQL statement is: "+ strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount=0;
            while (rset.next()){
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(author + ", " +title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of record = "+rowCount);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
