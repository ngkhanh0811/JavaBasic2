package src.task09;/*Welcome to my show !

@author: NgKhanh
Date: 5/13/2022
Time: 9:56 PM

ProjectName: JavaBasic2*/

import java.sql.*;

public class PreparedStatement {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root","");
                java.sql.PreparedStatement prstmt = conn.prepareStatement("insert into book values (?,?,?,?,?,?,?)");

                java.sql.PreparedStatement prstmtSelect = conn.prepareStatement("select * from book");
                ) {
            prstmt.setInt(1,7009);
            prstmt.setString(2,"Majong 101");
            prstmt.setInt(3,12);
            prstmt.setString(4, "Paul Chan");
            prstmt.setInt(5, 12);
            prstmt.setString(6,"novel");
            prstmt.setInt(7,1);
            int rowInserted = prstmt.executeUpdate();
            System.out.println(rowInserted + "row affected.");

            prstmt.setInt(1, 7010);
            prstmt.setString(2,"Majong 102");
            rowInserted = prstmt.executeUpdate();
            System.out.println(rowInserted + "row affected.");

            ResultSet rset = prstmtSelect.executeQuery();
            while (rset.next()){
                System.out.println(rset.getInt("bookID")+rset.getString("title")+rset.getInt("price")+rset.getString("author")
                + rset.getInt("qty") + rset.getString("category")+rset.getInt("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
