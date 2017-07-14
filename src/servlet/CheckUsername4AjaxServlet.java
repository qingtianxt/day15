package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;

/**
 * ԭ��ajax����û����Ƿ�ռ��
 */
public class CheckUsername4AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.���ñ���
		
		//1.�����û���
		String username = request.getParameter("username");
		username= new String(username.getBytes("iso-8859-1"),"utf-8");
		System.out.println(username);
		
		//2������service���� ��ɲ�ѯ ����ֵuser
		User user = null;
		try {
			user = new UserService().CheckUsername4Ajax(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3���ж�user д����Ϣ
		if(user==null){
			
			response.getWriter().println("1");
		}
		else{
			response.getWriter().println("0");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
