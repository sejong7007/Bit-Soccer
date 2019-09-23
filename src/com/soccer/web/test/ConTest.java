package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.pool.Constants;

public class ConTest {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stnt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(Constants.DRIVER);
			conn = DriverManager.getConnection( Constants.URL,
												Constants.USERNAME,
												Constants.PASSWORD);
			if(conn != null) {
				System.out.println("연결성공");
				stnt = conn.createStatement();
				rs = stnt.executeQuery("SELECT P.*, (SELECT TEAM_NAME FROM TEAM WHERE TEAM_ID LIKE P.TEAM_ID )\r\n" + 
						"FROM (SELECT *\r\n" + 
						"           FROM PLAYER\r\n" + 
						"           WHERE POSITION IN('GK','MF')\r\n" + 
						"            AND TEAM_ID IN('K07','K09','K08')) P");
				
				List<String> list = new ArrayList<>();
				while(rs.next()) {
				//	count = rs.getString("count");
				}
				//System.out.println("선수들의 수 : "+ count);
				
			}else {
				System.out.println("연결실패");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		
		
	}

}
