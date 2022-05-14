package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/14/2022
Time: 1:39 PM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.util.Scanner;

public class TestMusic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            Statement stmt = conn.createStatement();
        ) {
            // Insert
            int countInserted = stmt.executeUpdate("insert into music values" + "(1,'See you again', 'WizKhalifa',2013),"
                    + "(2,'Girls like you','Maroon5',2021),"
                    + "(3, 'Style','TaylorSwift',2019),"
                    + "(4,'Sugar','Maroon5', 2012),"
                    + "(5, 'Just give me a reason','Pink',2017),"
                    + "(6,'Photograph','Edsheeran',2020)"
            );
            System.out.println(countInserted + "records inserted.\n");

            // Update
            stmt.executeUpdate("update music set years = 2021 where id = 3");
            System.out.println("Update sucessful!");

            //Delete
            int countDeleted = stmt.executeUpdate("delete from music where years <= 2017");
            System.out.println(countDeleted + "record deleted.\n");

            // Search
            System.out.println("Enter author name to search: ");
            name = in.next();
            ResultSet rs = stmt.executeQuery("select * from music where author = '"+ name +"'");
            int rowCount = 0;
            System.out.println("The record selected are:");
            while (rs.next()){
                System.out.println(rs.getInt("id")+", "+rs.getString("name")+", "+rs.getString("author")+", "+rs.getInt("years"));
                rowCount++;
            }
            System.out.println("Total of records: "+rowCount);
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
