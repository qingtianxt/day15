package jqueryAjaxServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * jquery��ajax
 */
public class JqueryAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����ʽ��"+request.getMethod());
		
		//���ܲ���
		String username =request.getParameter("username");
		//username= new String(username.getBytes("iso-8859-1"),"utf-8");
		System.out.println(username);
		
		//��Ӧ����
		
		response.getWriter().print("sucess");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("����ʽ��"+request.getMethod());
		
		//���ܲ���
		String username =request.getParameter("username");
		System.out.println(username);
		
		
		//��Ӧ����
		//response.getWriter().print("sucess");
		
		
		String s = "{\"result\":\"sucess\",\"msg\":\"�ɹ�\"}";
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print(s);
	}

}
