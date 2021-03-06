package com.mpool.account.service;
import java.util.List;
import com.mpool.account.entity.StatsUsersMinute;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsUsersMinuteService  {
	List<StatsUsersMinute> getAll();
	
	void addStatsUsersMinute(StatsUsersMinute statsUsersMinute);
	
	void addStatsUsersMinuteList(List<StatsUsersMinute> list);
	
	void editStatsUsersMinute(StatsUsersMinute statsUsersMinute);
	
	void delStatsUsersMinute(Integer puid);
	
	StatsUsersMinute findStatsUsersMinuteById(Integer puid);
}
