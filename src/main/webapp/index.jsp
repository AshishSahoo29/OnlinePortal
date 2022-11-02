<%@page import="com.DB.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="components/all_css.jsp"%>
<style type="text/css">
.bg-image {
	background: url("image/");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<% Connection conn = DBConnect.getConn();
	out.println(conn);%>
	
	<div class="contaniner-fluid bg-img">
		<div class="text-center">
			<h1 class="text-white-p-4">
				<i class="fa-fa-book" aria-hidden="true"></i>Online Job Portal
			</h1>
		</div>
	</div>
	<%@ include file="components/footer.jsp" %>
</body>
</html>