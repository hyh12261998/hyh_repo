package pers.hyh.JDBCdemo2.persondemo;

import com.mysql.jdbc.Connection;

public class test {

	public static void main(String[] args) {
		JDBCOperation.insert(new Person(19,"test19",19));
		JDBCOperation.update(new Person(2,"test15",18));
	}
}
