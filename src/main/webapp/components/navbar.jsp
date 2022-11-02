<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<nav class="navbar navbar-expand-lg navbar bg-custom">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <c:if test="${userobj.role eq 'admin' }">
      <li class="nav-item">
        <a class="nav-link" href="addjob.jsp">Post Job</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="viewjob.jsp">View Job</a>
      </li>
	  </c:if>
    </ul>
    <form class="form-inline my-2 my-lg-0 mr-5">
     	<a href="login.jsp" class="btn btn-light "><i class="fa-solid fa-arrow-right-to-bracket"></i>Login</a>
     	<a href="signup.jsp" class="btn btn-light"><i class="fa-solid fa-user-plus"></i>Sign Up</a>
    </form>
  </div>
</nav>