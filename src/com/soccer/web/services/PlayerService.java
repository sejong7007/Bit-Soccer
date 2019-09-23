package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {

	/*
	 * SQL_TEST_002 :  포지션 종류(중복제거,없으면 빈공간)
	 */
	public List<String> findPositions();
	/*
	 * SQL_TEST_004 :  포지션 종류(중복제거,없으면 빈공간)
	 * 결과 : 인스턴스 4개 => 반환값을 리스트로 한다.
	 */
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param);
	
	/*
	 * SQL_TEST_005 :  포지션 종류(중복제거,없으면 빈공간)
	 * 결과 : 인스턴스 2개 => 반환값을 리스트로 한다.
	 */
	public List<PlayerBean> findByHeightPlayerName(PlayerBean param);
	
	
	
	
}
