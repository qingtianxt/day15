package service;

import java.sql.SQLException;
import java.util.List;

import dao.CityDao;
import domain.City;

public class CityService {
/**
 * 通过省份id 查询所有的市
 * @param pid
 * @return
 * @throws SQLException 
 */
	public List<City> findCitiesByPid(String pid) throws SQLException {
		return new CityDao().findCitiesByPid(pid);
	}

}
