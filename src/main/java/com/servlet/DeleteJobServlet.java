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

@WebServlet("/delete")
public class DeleteJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			JobDAO dao = new JobDAO(DBConnect.getConn());
			boolean f = dao.deleteJobs(id);

			HttpSession sess = request.getSession();
			
			if (f) {
				sess.setAttribute("succMsg", "Job deleted Successfully..");
				response.sendRedirect("viewjob.jsp");
			} else {
				sess.setAttribute("succMsg", "Something went wrong on Server..");
				response.sendRedirect("viewjob.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
