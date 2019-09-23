package com.soccer.web.serviceimpls;

public class ScheduleServiceImpl {
	
	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();

	public static ScheduleServiceImpl getScheduleservice() {
		return instance;
	}
	
	private ScheduleServiceImpl() {}

}
