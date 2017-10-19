<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="../contents/css/bootstrap.min.css">
<link rel="stylesheet" href="../contents/css/style.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-offset-3 col-md-6">
				<form class="form-horizontal"
					action="/maventest/account/login.action" method="post">
					<span class="heading">Login</span>
					<div class="form-group">
						<input type="text" class="form-control" name="username"
							placeholder="UserName"> <i class="fa fa-user"></i>
					</div>
					<div class="form-group help">
						<input type="password" class="form-control" name="password"
							placeholder="Password"> <i class="fa fa-lock"></i> <a
							href="#" class="fa fa-question-circle"></a>
					</div>
					<div class="form-group">
						<select name="role" class="form-control">
							<option value="0">administrator</option>
							<option value="1">staff</option>
						</select>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-default">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- <form action="/maventest/account/login.action" method="post">
			username:<input type="text" name="username" value="admin">
			password:<input type="password" name="password" value="hehe">
			role: <select name="role">
				<option value="0">administrator</option>
				<option value="1">staff</option>
			</select> <input type="submit" value="login">
		</form> -->
	</div>
	<script type="text/javascript" src="../contents/js/jquery.min.js"></script>
	<script type="text/javascript" src="../contents/js/bootstrap.min.js"></script>
</body>
</html>