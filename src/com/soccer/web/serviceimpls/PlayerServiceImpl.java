package com.soccer.web.serviceimpls;

import java.util.List;

import com.soccer.web.daoimpls.PlayerDaoImpl;
import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{

	private static PlayerServiceImpl instance = new PlayerServiceImpl();
		
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {}

	@Override
	public List<String> findPositions() {
		System.out.println("service 도착");
		return PlayerDaoImpl.getInstance().selectPositions();
		
		//List<String> arr = PlayerDaoImpl.getInstance().selectPositions();
		//System.out.println(arr);
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl.getInstance().selectByTeamIdPositon(param);
		return players;
	}

	@Override
	public List<PlayerBean> findByHeightPlayerName(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl.getInstance().selectByHeightPlayerName(param);
		return players;
	}
}




