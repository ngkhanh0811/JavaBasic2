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
            System.out.println("Press 1 to insert value");
            System.out.println("Press 2 to update value");
            System.out.println("Press 3 to delete value");
            System.out.println("Press 4 to search by songs author");
            System.out.println("Press 5 to see all of table");
            System.out.println("Select options: ");
            int select = in.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter song ID: ");
                    int id = in.nextInt();
                    System.out.println("Enter song name: ");
                    name = in.next();
                    System.out.println("Enter song author: ");
                    String author = in.next();
                    System.out.println("Enter release year: ");
                    int year = in.nextInt();
                    int countInsert = stmt.executeUpdate("insert into music values" + "('" + id + "','" + name + "','" + author + "','" + year + "')");
                    System.out.println(countInsert + "records inserted.\n");
                    break;
                case 2:
                    System.out.println("Enter column name you wanna update: ");
                    String column = in.next();
                    System.out.println("Enter old column: ");
                    String oldColumn = in.next();
                    System.out.println("Enter old value: ");
                    String oldValue = in.next();
                    System.out.println("Enter new value: ");
                    String value = in.next();
                    stmt.executeUpdate("update music set '"+ column +"' = '"+ value +"' where '"+oldColumn+"' = '"+oldValue+"'");
                    System.out.println("Update sucessful!");
                    break;
                case 3:
                    System.out.println("Enter id you wanna delete: ");
                    int delete = in.nextInt();
                    stmt.executeUpdate("delete from music where id = '"+delete+"'");
                    System.out.println("Delete successful!");
                    break;
                case 4:
                    System.out.println("Enter author name to search: ");
                    name = in.next();
                    ResultSet rs = stmt.executeQuery("select * from music where author = '"+ name +"'");
                    int rowCount = 0;
                    System.out.println("The record selected are:");
                    while (rs.next()){
                        System.out.println(rs.getInt("id")+", "+rs.getString("name")+", "+rs.getString("author")+", "+rs.getInt("year"));
                        rowCount++;
                    }
                    System.out.println("Total of records: "+rowCount);
                    break;
                case 5:
                    ResultSet rset = stmt.executeQuery("select * from music");
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
                    break;
                default:
                    System.out.println("Undefined!");
            }
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
