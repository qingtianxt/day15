<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		$("#tid").keyup(function(){
			//获取文本框的值
			var $value = $(this).val();
			
			//内容为空的时候不发送ajax
			if($value!=null&&$value!=''){
				$("#did").html("");
				
				$.post("/day15/searchKw","kw="+$value,function(d){
					if(d!=""){
						var arr=d.split(",");
						$(arr).each(function(){
							//alert(this);
							//将每一个值放入id为did,将每一个值放入div中，
							$("#did").append($("<div>"+this+"</div>"));
						})
						//将div显示
						$("#did").show();
					}
					else{
						$("#did").hide();
					}
				})
			}
			else{
				//将div隐藏
				$("#did").hide();
			}
		})
		
	})
</script>
</head>
<body>  
	<center>
		<h1>黑马搜索</h1>
		<div>
			<input name="kw" id="tid"><input type="submit" value="黑马一下">
		</div>
		<div id="did" style="border:1px solid red;width:171px;position: relative;left: -34px;display:none "></div>
	</center>
</body>
</html>