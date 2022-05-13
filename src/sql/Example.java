package src.sql;/*Welcome to my show !

@author: NgKhanh
Date: 5/11/2022
Time: 8:05 PM

ProjectName: JavaBasic2*/

import java.sql.*;

public class Example {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "";
            /**
             * Kết nối tới cơ sở dữ liệu
             * localhost:3306 : Địa chỉ máy chủ
             * user = "root" : Tên tài khoản kết nối tới database
             * password : mật khẩu
             * => Phân quyền người dùng. VD : cấp cho 1 CTV 1 tk chỉ cho phép truy xuất dữ liệu chứ ko cho sửa xóa
             */
            Connection conn = DriverManager.getConnection(url,user,password);

            /**
             * Statement : hiểu đơn giản là mệnh lệnh
             */
            Statement stm = conn.createStatement();
            /**
             * Update,Insert,Delete : Sử dụng executeUpdate => Sự cập nhật liên quan tới bảng
             */
            String sqlUpdate = "Update book Set qty = 15 where bookID = 2001";
            int countRecord = stm.executeUpdate(sqlUpdate);
            System.out.println("Record = " + countRecord);

            // Xóa
            String sqlDelete = "delete from book where bookID > 3000";
            countRecord = stm.executeUpdate(sqlDelete);
            System.out.println("Record = " + countRecord);

            // Thêm bản ghi
            String sqlInsert = "Insert into book values (5888, 'SQL Database',20, 'Khanh', 23, 'novel', 1)";
            countRecord = stm.executeUpdate(sqlInsert);
            System.out.println("Record = " + countRecord);

            // Truy vấn có điều kiện
            String sqlSeach = "Select * from book where title LIKE '%Java%' ";
            ResultSet rset = stm.executeQuery(sqlSeach);

            while (rset.next()) {
                System.out.println(rset.getInt("bookID") + ","
                        + rset.getString("title") + ","
                        + rset.getDouble("price") + ","
                        + rset.getString("author") + ","
                        + rset.getInt("qty") + ", "
                        + rset.getString("category") + ","
                        + rset.getInt("status"));
            }
            /**
             * ResultSet rset : trả về danh sách các bản ghi
             * rset.next() :
             */
            // Truy vấn
            String strSelect = "select * from book";
            rset = stm.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("bookID") + ","
                        + rset.getString("title") + ","
                        + rset.getDouble("price") + ","
                        + rset.getString("author") + ","
                        + rset.getInt("qty") + ", "
                        + rset.getString("category") + ","
                        + rset.getInt("status"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
