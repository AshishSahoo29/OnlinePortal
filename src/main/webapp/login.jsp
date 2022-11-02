<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@include file="components/all_css.jsp"%>

</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="continer-fluid">
		<div class="row p-5">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body"></div>
					<div class="text-center">
						<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
						<h4>Login Page</h4>

						
						<form action="logincontroller" method="post">

							<div class="form-group">
								<label>Enter Email</label> <input type="email" name="email">
							</div>
							<div class="form-group">
								<label>Enter Password</label> <input type="password" name="password">
							</div>
							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Login</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>