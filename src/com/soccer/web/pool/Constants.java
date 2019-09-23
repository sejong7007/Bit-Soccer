package com.soccer.web.pool;

import java.sql.DriverManager;

public class Constants {

	public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
	
	public static final String 	URL = "jdbc:oracle:thin:@localhost:1521:xe" , 
								DRIVER ="oracle.jdbc.OracleDriver",
								USERNAME = "c##sejong",
								PASSWORD = "7007";
	
	
	
}
