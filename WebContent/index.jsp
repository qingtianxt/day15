<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	原生的ajax<br>
	<hr>
	<a href="${pageContext.request.contextPath }/js_ajax/hello.jsp">入门</a><br>
	<a href="${pageContext.request.contextPath }/js_ajax/get.jsp">get请求</a><br>
	<a href="${pageContext.request.contextPath }/js_ajax/post.jsp">get请求</a><br>
	<a href="${pageContext.request.contextPath }/demo1.jsp">案例1 用户名是否占用</a><br>
	<hr>
	jquery的ajax<br>
	
	<a href="${pageContext.request.contextPath }/jquery_ajax/ajax.jsp">ajax四种方式</a><br>
	<a href="${pageContext.request.contextPath }/demo2.jsp">案例2 用户名是否占用</a><br>
</body>
</html>