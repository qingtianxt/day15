package ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * get����
 */
public class Ajax2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���ܲ���
		String username = request.getParameter("username");
		System.out.println(username);
		// ��Ӧ����
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("������" + username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getMethod());
		request.setCharacterEncoding("utf-8");
		// ���ܲ���
		String username = request.getParameter("username");
		System.out.println(username);
		// ��Ӧ����
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("post������" + username);

	}

}
