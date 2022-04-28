package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 4/28/2022
Time: 10:52 AM

ProjectName: JavaBasic2*/

import java.sql.*;

public class SelectWithName {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nortwind", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select Address, CompanyName, ContactName, City from customers where CustomerID = 'ALFKI'";
            System.out.println("The SQL statement is: "+ strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount=0;
            while (rset.next()){
                String address = rset.getString("Address");
                String companyName = rset.getString("CompanyName");
                String contactName = rset.getString("ContactName");
                String city = rset.getString("City");
                System.out.println(address + ", " + companyName + ", " + contactName + ", " + city);
                ++rowCount;
            }
            System.out.println("Total number of record = "+rowCount);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
