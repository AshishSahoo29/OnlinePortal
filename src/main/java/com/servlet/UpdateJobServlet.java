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
 * Servlet implementation class UpdateJobServlet
 */
@WebServlet("/update")
public class UpdateJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String title = request.getParameter("title");
			String location = request.getParameter("location");
			String category = request.getParameter("category");
			String status = request.getParameter("status");
			String desc = request.getParameter("desc");
			
			Jobs j = new Jobs(id, title, desc, location, category, status,null );
			j.setId(id);
			j.setTitle(title);
			j.setDescription(desc);
			j.setLocation(location);
			j.setCategory(category);
			j.setStatus(status);
			
			HttpSession sess = request.getSession();
			
			JobDAO dao = new JobDAO(DBConnect.getConn());
			boolean f = dao.updateJob(j);
			if(f) {
				sess.setAttribute("succMsg", "Job updated Successfully..");
				response.sendRedirect("viewjob.jsp");
			}else {
				sess.setAttribute("succMsg", "Something went wrong on Server..");
				response.sendRedirect("viewjob.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
