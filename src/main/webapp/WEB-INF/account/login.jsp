<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<form action="/maventest/account/login.action" method="post">
	username:<input type="text" name="username" value="admin">
	password:<input type="password" name="password" value="hehe">
	role:
	<select name="role">
		<option value="0">administrator</option>
		<option value="1">staff</option>
	</select>
	
	<input type="submit" value="login">
</form>
</body>
</html>