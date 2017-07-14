package ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * get请求
 */
public class Ajax2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接受参数
		String username = request.getParameter("username");
		System.out.println(username);
		// 响应数据
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("姓名：" + username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getMethod());
		request.setCharacterEncoding("utf-8");
		// 接受参数
		String username = request.getParameter("username");
		System.out.println(username);
		// 响应数据
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("post姓名：" + username);

	}

}
