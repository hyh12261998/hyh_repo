package pers.hyh.JDBCdemo2.persondemo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBCOperation {
	public static int insert(Person person) {
		Connection conn=JDBCUtil.getConn();
		String sql="insert into test(Id,Name,Age) values(?,?,?)";
		PreparedStatement psmt;
		int i=0;
		try {
			psmt=(PreparedStatement)conn.prepareStatement(sql);
			psmt.setInt(1, person.getId());
			psmt.setString(2, person.getName());
			psmt.setInt(3, person.getAge());
			i=psmt.executeUpdate();
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public static int update(Person person) {
		Connection conn=JDBCUtil.getConn();
		int i=0;
		String sql="update test set Name='"+person.getName()+"'where Id="+person.getId()+"";
		PreparedStatement psmt;
		try {
			psmt=(PreparedStatement)conn.prepareStatement(sql);
			i=psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
