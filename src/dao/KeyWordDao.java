package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import Utils.DataSourceUtils;

public class KeyWordDao {

	public List<Object> findKw4Ajax(String kw) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select kw from keyword where kw like ? limit 5";
		
		return qr.query(sql, new ColumnListHandler("kw"),"%"+kw+"%");
		
		//  ������������������ȡ�������ĳ�е��������ݣ�����ӵ�ArrayList�С��������ΪScalarHandler<T>�ļ�ǿ�档
	}
	
}
