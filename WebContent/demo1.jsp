<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="#">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username"
					onblur="checkUsername(this)"></td>
				<td><span id="username_msg"></span></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" id="sub"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
	//失去焦点 发送ajax
	function checkUsername(obj) {
		//alert(obj.value);
		
		//创建核心对象
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
		xmlhttp.onreadystatechange =function(){
			if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
				//alert(xmlhttp.responseText);
				if(xmlhttp.responseText==1){
					document.getElementById("username_msg").innerHTML="<font color='green'>用户名可以使用</font>"
					document.getElementById("sub").disabled=false;
				}
				else{
					document.getElementById("username_msg").innerHTML="<font color='red'>用户名已被占用</font>"					
					
					document.getElementById("sub").disabled=true;
				}
			}
		}
		
		//open操作
		xmlhttp.open("get","${pageContext.request.contextPath}/checkUsername4Ajax?username="+obj.value);
		
		//send操作
		xmlhttp.send();
	}
</script>
</html>