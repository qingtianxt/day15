package service;

import java.sql.SQLException;
import java.util.List;

import dao.CityDao;
import domain.City;

public class CityService {
/**
 * ͨ��ʡ��id ��ѯ���е���
 * @param pid
 * @return
 * @throws SQLException 
 */
	public List<City> findCitiesByPid(String pid) throws SQLException {
		return new CityDao().findCitiesByPid(pid);
	}

}
