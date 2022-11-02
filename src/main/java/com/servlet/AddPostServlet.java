package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.JobDAO;
import com.DB.DBConnect;
import com.entity.Jobs;

/**
 * Servlet implementation class AddPostServlet
 */
@WebServlet("/addjob")
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String title = request.getParameter("title");
			String location = request.getParameter("location");
			String category = request.getParameter("category");
			String staus = request.getParameter("status");
			String desc = request.getParameter("desc");
			
			Jobs j = new Jobs(title, desc, location, staus, category);
			j.setTitle(title);
			j.setDescription(desc);
			j.setLocation(location);
			j.setStatus(staus);
			j.setCategory(category);
			
			HttpSession sess = request.getSession();
			
			JobDAO dao = new JobDAO(DBConnect.getConn());
			boolean f = dao.addJobs(j);
			if(f) {
				sess.setAttribute("succMsg", "Job Posted Successfully..");
				response.sendRedirect("addjob.jsp");
			}else {
				sess.setAttribute("succMsg", "Something went wrong on Server..");
				response.sendRedirect("addjob.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
