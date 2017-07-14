<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="点我" onclick= "btnClick()">
	
	
</body>
	<script type="text/javascript">
		function btnClick(){
			//核心对象
			xmlhttp=null;
			if (window.XMLHttpRequest)
			  {// code for Firefox, Opera, IE7, etc.
			  xmlhttp=new XMLHttpRequest();
			  }
			else if (window.ActiveXObject)
			  {// code for IE6, IE5
			  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
			  }
			//编写回调函数
			xmlhttp.onreadystatechange = function(){
				if(xmlhttp.readyState == 4 && xmlhttp.status==200){
					alert(xmlhttp.responseText);
				}
			}
			
			//open
			
			xmlhttp.open("post","/day15/ajax2");//post请求时放在地址栏中，是无法识别中文字符
			
			//设置请求头(post请求需要添加的内容)放在send方法之前
			xmlhttp.setRequestHeader("content-type","application/x-www-form-urlencoded")
			
			//send
			xmlhttp.send("username=张三");//地址栏中不识别，所以
		}
	</script>
	
</html>