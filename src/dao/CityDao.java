package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import Utils.DataSourceUtils;
import domain.City;

public class CityDao {
/**
 *
 * @param pid
 * @return
 * @throws SQLException 
 */
	public List<City> findCitiesByPid(String pid) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql ="select * from city where provinceid =?";
		return qr.query(sql, new BeanListHandler<>(City.class),pid);
	}

}
