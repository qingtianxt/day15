package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Province;
import net.sf.json.JSONArray;
import service.ProvinceService;

/**
 * 查询所有的省
 */
public class SelectProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.调用service 查询所有的省份
		List<Province> list = null;
		try {
			list = new ProvinceService().findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//2，将所有省份写回去
		response.setContentType("text/html;charset=utf-8");
		if(list!=null&&list.size()>0){
			response.getWriter().println(JSONArray.fromObject(list));
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
