package com.soccer.web.serviceimpls;

public class StadiumServiceImpl {

	private static StadiumServiceImpl instance = new StadiumServiceImpl();

	public static StadiumServiceImpl getStadiumservice() {
		return instance;
	}
	
	private StadiumServiceImpl() {}
	
}
