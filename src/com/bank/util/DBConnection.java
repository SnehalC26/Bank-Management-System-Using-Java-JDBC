package com.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
private static Connection con=null;

public static Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}
}
