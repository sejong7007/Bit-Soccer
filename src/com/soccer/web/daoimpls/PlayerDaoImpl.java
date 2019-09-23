package com.soccer.web.daoimpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constants;

public class PlayerDaoImpl implements PlayerDao {

	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	
	private static Connection conn;	
	
	public static PlayerDaoImpl getInstance() {
		
		try {
			Class.forName(Constants.DRIVER);
			conn = DriverManager.getConnection( Constants.URL,
												Constants.USERNAME,
												Constants.PASSWORD);
			
		} catch (Exception e) {
					e.printStackTrace();
		}
		
		return instance;
	}
	
	private PlayerDaoImpl() {}
	
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		
		try {
			String sql = "SELECT DISTINCT POSITION position \n" + 
					"FROM PLAYER";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPositon(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerBean> selectByHeightPlayerName(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
