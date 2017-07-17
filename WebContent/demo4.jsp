<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		//页面加载成功 查询所有的的省
		$.get("/day15/selectPro",function(d){
			var $pro = $("#proId");
			$(d).each(function(){
				$pro.append($("<option value="+this.provinceid+">"+this.name+"</option>"));
			})
		},"json");
		
		
		//给省份下拉选派发change事件
		$("#proId").change(function(){
			//获取省份id
			var $pid =$(this).val();
			//alert($pid);
			//发送ajax请求，查询所有的市
			$.get("/day15/selectCity",{"pid":$pid},function(d){
				//alert(d)
				var $city = $("#cityId");
				$city.html("<option>--请选择--</option>");
				if(d!=null){
					$(d).each(function(){
						$city.append($("<option value="+this.cityid+">"+this.name+"</option>"))
					})
				}
			},"json")
		})
	})
	
</script>
</head>
<body>
	<select id="proId" name="province">
		<option>--省份--</option>
	</select>
	<select id="cityId" name="city">
		<option>--请选择--</option>
	</select>
</body>
</html>