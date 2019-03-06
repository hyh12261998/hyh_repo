package pers.hyh.JDBCdemo2.persondemo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JDBCUtil {
	public static Connection getConn() {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/sqltest";
		String username="root";
		String password="11q22q33q";
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=(Connection)DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
