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
 * 原生ajax检测用户名是否被占用
 */
public class CheckUsername4AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置编码
		
		//1.接受用户名
		String username = request.getParameter("username");
		username= new String(username.getBytes("iso-8859-1"),"utf-8");
		System.out.println(username);
		
		//2，调用service方法 完成查询 返回值user
		User user = null;
		try {
			user = new UserService().CheckUsername4Ajax(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3，判断user 写回信息
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
