<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<table width="500" border="1" cellspacing="1">
		<tr>
			<th>序号</th>
			<th>名字</th>
			<th>年龄</th>
			<th>地址</th>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.uname }</td>
				<td>${user.age }</td>
				<td>${user.address }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>