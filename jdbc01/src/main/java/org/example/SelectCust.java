package org.example;

import java.sql.*;

public class SelectCust {
    public static void main(String[] args) {
        // 1. MySQL Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        // 2. Connection
        String url = "jdbc:mysql://127.0.0.1:3306/shopdb";
        String user = "smuser";
        String password = "111111";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Success");
        } catch (SQLException e) {
            System.out.println("Connection Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        // 3. SQL 문장 생성
        String selectAllSql = "Select * from cust where cust_id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(selectAllSql);
            pstmt.setString(1, "id01");
            // 4. SQL 문장 전송
            rs = pstmt.executeQuery();
            System.out.println("Select Success: ");
            rs.next();
            String id = rs.getString("cust_id");
            String pwd = rs.getString("cust_pwd");
            String name = rs.getString("cust_name");
            Date cust_regdate = rs.getDate("cust_regdate");
            Date cust_update = rs.getDate("cust_update");
            System.out.println(id+" "+pwd+" "+name+" "+cust_regdate+" "+cust_update);
        } catch (SQLException e) {
            System.out.println("SQL Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // 5. Close
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {}
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}