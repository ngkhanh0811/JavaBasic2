package src.task09;/*Welcome to my show !

@author: NgKhanh
Date: 5/13/2022
Time: 9:43 PM

ProjectName: JavaBasic2*/

import java.sql.*;

public class JdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root","");
                Statement stmt = conn.createStatement();
                ){
            try{
                conn.setAutoCommit(false);

//                stmt.executeUpdate("insert into book values (4003, 'Paul Chan',10, 'MaJong 101', 42, 'novel',1)");
//                stmt.executeUpdate("insert into book values (4004, 'Peter Chan',12, 'MaJong 102', 41, 'novel', 1)");
//                conn.commit();

                ResultSet rset = stmt.executeQuery("select * from book");
                ResultSetMetaData rsetMD = rset.getMetaData();
                int numcolumn = rsetMD.getColumnCount();

                for(int i = 1; i<= numcolumn; i++){
                    System.out.printf("%-30s", rsetMD.getColumnName(i));
                }
                System.out.println();
                for (int i=1; i<= numcolumn; i++){
                    System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i)+ ")");
                }
                while (rset.next()){
                    for (int i = 1;i<=numcolumn;i++){
                        System.out.printf("%-30s", rset.getString(i));
                    }
                    System.out.println();
                }
            } catch (SQLException ex){
                System.out.println("--Rolling back changes--");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
