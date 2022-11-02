<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<%@include file="components/all_css.jsp"%>
<style type="text/css">
.back-img{
background: url("image/");
height: 80vh;
width: 100%;
background-repeat: no-repeat;
background-size: cover;
}
</style>
</head>
<body>
<c:if test="${userobj.role ne 'admin' }">
<c:redirect url="login.jsp"></c:redirect>
</c:if>


<%@include file="components/navbar.jsp"%>
<div class="contaniner-fluid back-img">
		<div class="text-center">
			<h1 class="text-white-p-4">Online Job Portal</h1>
		</div>
</body>
</html>