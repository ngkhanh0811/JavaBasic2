package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/10/2022
Time: 8:21 PM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class ExUpdateDeleteInsert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                Statement stmt = conn.createStatement();
                ){
            String strSelect = "select * from book";
            ResultSet rs = stmt.executeQuery(strSelect);
            System.out.println("Before update: ");

            while (rs.next()){
                int bookID = rs.getInt("bookID");
                String title = rs.getString("title");
                int price = rs.getInt("price");
                String author = rs.getString("author");
                int qty = rs.getInt("qty");
                String category = rs.getString("category");
                int status = rs.getInt("status");
                System.out.println(bookID + ", "+title+", "+price+", "+author+", "+qty+", "+category+", "+status);
            }


            String strUpdate = "update book" + " set title = 'Doraemon' where bookID = 620";
            stmt.executeUpdate(strUpdate);

            String sqlDelete = "delete from book where bookID > 8000";
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            String sqlInsert = "insert into book values " + "(80011, 'JavaCore', 13, 'Dang Kim Thi', 102, 'Sign', 1),"+ " (8012,'Java Advanced', 14, 'James Gosling', 96, 'Sign', 1)";
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            sqlInsert = "insert into book(bookID, title, author) values (2004, 'Java JDBC mySQL', 'ThiDK')";
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "record inserted.\n");

            System.out.println("Enter your id delete: ");
            int a = in.nextInt();
            sqlDelete = "delete from book where bookID = '"+ a +"'";
            countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            System.out.println("Insert new bookID: ");
            int newID = in.nextInt();
            System.out.println("Insert this title: ");
            String newTitle = in.next();
            System.out.println("Insert this price: ");
            int newPrice = in.nextInt();
            System.out.println("Insert this author name: ");
            String newAuthor = in.next();
            System.out.println("Insert this qty: ");
            int newQTY = in.nextInt();
            System.out.println("Insert this category: ");
            String newCategory = in.next();
            System.out.println("Insert this status: ");
            int newStatus = in.nextInt();
            sqlInsert = "insert into book values" + " ('" +newID+ "', '" +newTitle+ "', '"+newPrice+"','" +newAuthor+ "','" +newQTY+ "','" +newCategory+ "','" +newStatus+ "' )";
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "records inserted.\n");

            String stSelect = "select * from book";
            ResultSet rss = stmt.executeQuery(stSelect);
            System.out.println("After update, insert and delete: ");

            while (rss.next()){
                int bookID = rss.getInt("bookID");
                String title = rss.getString("title");
                int price = rss.getInt("price");
                String author = rss.getString("author");
                int qty = rss.getInt("qty");
                String category = rss.getString("category");
                int status = rss.getInt("status");
                System.out.println(bookID + ", "+title+", "+price+", "+author+", "+qty+", "+category+", "+status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
