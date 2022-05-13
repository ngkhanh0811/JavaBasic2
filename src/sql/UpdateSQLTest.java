package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/7/2022
Time: 8:46 PM

ProjectName: JavaBasic2*/

import java.sql.*;

public class UpdateSQLTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
                ){
            String strUpdate = "update book " + " set title = 'Onepiece' where bookID = 621";
            System.out.println("The SQL statement is: "+ strUpdate + "\n");

            stmt.executeUpdate(strUpdate);

            String strSelect = "select title from book where bookID = 621";
            System.out.println("The SQL statement is: "+ strSelect + "\n");

            ResultSet rs = stmt.executeQuery(strSelect);
            System.out.println("The record selected are: ");
            int rowCount = 0;
            while (rs.next()){
                String title = rs.getString("Title");
                System.out.println(title);
                ++rowCount;
            }
            System.out.println("Total number of record: " + rowCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
