package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.crypto.provider.RSACipher;

import service.KeyWordService;

/**
 * 
 */
public class SearchKwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.���ñ���
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//1.��ȡkw
		String kw = request.getParameter("kw");
		
		//2.����service ���ģ������������ֵlist
		List<Object> list =null;
		try {
			list = new KeyWordService().findKw4Ajax(kw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 //�����ݡ�a,aa,aaa��ȥ������д��ȥ��a,aa,aaa  
		String rs="";
		if(list!=null){
			if(list.size()==1){
				rs+=list.get(0);
			}else{
				for (int i=0;i<list.size()-1;i++) {
					rs+=list.get(i)+",";
				}
				rs+=list.get(list.size()-1);
			}
				
			}
		response.getWriter().println(rs);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
