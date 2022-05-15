package src.task09;/*Welcome to my show !

@author: NgKhanh
Date: 5/15/2022
Time: 6:11 PM

ProjectName: JavaBasic2*/

import java.sql.*;
import java.sql.PreparedStatement;

public class BatchPreparement {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root","");
                java.sql.PreparedStatement prstmt = conn.prepareStatement("insert into book values (?,?,?,?,?,?,?)");
        ){
            conn.setAutoCommit(false);
//            prstmt.setInt(1,4007);
//            prstmt.setString(2,"Majong 105");
//            prstmt.setInt(3,19);
//            prstmt.setString(4, "David Chan");
//            prstmt.setInt(5, 16);
//            prstmt.setString(6,"novel");
//            prstmt.setInt(7,1);
//            prstmt.addBatch();
//
//            prstmt.setInt(1,4008);
//            prstmt.setString(2, "Java 456");
//            prstmt.addBatch();

            int[] returnCodes = prstmt.executeBatch();
            System.out.println("Return codes are: ");
            for (int code: returnCodes){
                System.out.println(code + ", ");
                System.out.println();
            }
            conn.commit();

            ResultSet rset = prstmt.executeQuery("select * from book");
            while (rset.next()){
                System.out.println(rset.getInt("bookID")+", "+rset.getString("title")+", "+rset.getInt("price")+", "+rset.getString("author")+", "+rset.getInt("qty")+", "+rset.getString("category")+", "+rset.getInt("status"));
            }
            conn.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
