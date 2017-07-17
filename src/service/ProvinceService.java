package service;

import java.sql.SQLException;
import java.util.List;

import dao.ProvinceDao;
import domain.Province;

public class ProvinceService {

	public List<Province> findAll() throws SQLException {
		return new ProvinceDao().findAll();
	}

}
