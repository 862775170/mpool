package com.btc.app.service;
import java.util.List;
import com.btc.app.entity.StatsUsersHour;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-09-26
 */
public interface StatsUsersHourService  {
	List<StatsUsersHour> getAll();
	
	void addStatsUsersHour(StatsUsersHour statsUsersHour);
	
	void addStatsUsersHourList(List<StatsUsersHour> list);
	
	void editStatsUsersHour(StatsUsersHour statsUsersHour);
	
	void delStatsUsersHour(Integer puid);
	
	StatsUsersHour findStatsUsersHourById(Integer puid);
}
