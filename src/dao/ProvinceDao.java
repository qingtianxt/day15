package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import Utils.DataSourceUtils;
import domain.Province;

public class ProvinceDao {

	public List<Province> findAll() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from province";
		
		return qr.query(sql, new BeanListHandler<>(Province.class));
	}

}
