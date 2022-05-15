package src.task09;/*Welcome to my show !

@author: NgKhanh
Date: 5/15/2022
Time: 6:07 PM

ProjectName: JavaBasic2*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root","");
                Statement stmt = conn.createStatement();
        ) {
            conn.setAutoCommit(false);

            stmt.addBatch("insert into book values (4005, 'James Chan',13, 'MaJong 103', 42, 'novel',1)");
            stmt.addBatch("insert into book values (4006, 'Christine Chan',14, 'MaJong 104', 41, 'novel', 1)");
            stmt.addBatch("update book set price = 11 where bookID = 4005 or bookID = 4006");
            int[] returnCodes = stmt.executeBatch();

            System.out.println("Return codes are: ");
            for (int code : returnCodes){
                System.out.println(code + ", ");
            }
            System.out.println();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
