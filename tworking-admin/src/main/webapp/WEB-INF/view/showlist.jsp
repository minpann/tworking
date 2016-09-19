<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
	<script type="text/javascript" src="<%=basePath %>/js/jquery-1.12.3.js"></script>
	<script type="text/javascript" src="<%=basePath %>/js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript">
	function testjquery()
	{
		 var user_name=$("#test").attr("value");
		 alert(user_name);
	}
	</script>
  </head>

  <body>
   <c:forEach var="example" items="${exampleList}">
       编号：<span>${example.id}</span><br/>
       姓名：<span>${example.username}</span><br/>
       地址：<span>${example.address}</span><br/>
       描述：<span>${example.description}</span><br/>
   </c:forEach>
  
  <input id="test" value="jquery">
  <input type="button" value="click me!" onclick="testjquery();">
  </body>
</html>