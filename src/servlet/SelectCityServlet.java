package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.City;
import net.sf.json.JSONArray;
import service.CityService;

/**
 * ����ʡ��id��ѯ���е���
 */
public class SelectCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.���ñ���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//1����ȡʡ��id
		String pid = request.getParameter("pid");
		//2.����service����ѯ���е��У�����list
		List<City> list= null;
		try {
			list = new CityService().findCitiesByPid(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3.��listת����json ����ҳ��
		if(list!=null&&list.size()>0){
			response.getWriter().println(JSONArray.fromObject(list));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
