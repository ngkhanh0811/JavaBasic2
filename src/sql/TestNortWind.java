package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 4/28/2022
Time: 10:47 AM

ProjectName: JavaBasic2*/

import java.sql.*;

public class TestNortWind {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nortwind", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select CustomerID, ContactName from customers";
            System.out.println("The SQL statement is: "+ strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount=0;
            while (rset.next()){
                String customerID = rset.getString("CustomerID");
                String contactName = rset.getString("ContactName");
                System.out.println(customerID + ", " + contactName);
                ++rowCount;
            }
            System.out.println("Total number of record = "+rowCount);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
