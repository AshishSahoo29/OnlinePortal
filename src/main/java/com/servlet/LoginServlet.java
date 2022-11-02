package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logincontroller")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String em = request.getParameter("email");
			String ps = request.getParameter("password");
			User user = new User();
			HttpSession session = request.getSession();
			
			if("admin@gmail.com".equals(em) && "12345".equals(ps)) {
				session.setAttribute("userobj", user);
				user.setRole("admin");
				response.sendRedirect("admin.jsp");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
