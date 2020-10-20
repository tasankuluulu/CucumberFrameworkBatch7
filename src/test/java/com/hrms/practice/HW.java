package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

import com.mysql.cj.jdbc.Driver;

public class HW {
	String dbUserName = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void newConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		ResultSetMetaData rsMetaData = rs.getMetaData();
		ArrayList<String> columnTypeNames = new ArrayList<>();
		ArrayList<String> columnNames = new ArrayList<>();
		System.out.printf("%-20s %-20s", "Column Type Name", "Column Name");
		for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
			columnTypeNames.add(rsMetaData.getColumnTypeName(i));
			columnNames.add(rsMetaData.getColumnName(i));
			System.out.printf("%n%-20s %-20s", columnNames.get(i - 1), columnTypeNames.get(i - 1));
		}
		rs.close();
		st.close();
		conn.close();

	}

}
