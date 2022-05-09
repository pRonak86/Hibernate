package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.StudentDAO;
import com.bean.Student;

/**
 * Servlet implementation class AcController
 */
public class AcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("SIGNUP")) {

			Student s = new Student();
			s.setName(request.getParameter("fname"));
			s.setPassword(request.getParameter("password"));
			s.setContact(Integer.parseInt(request.getParameter("contact")));
			s.setEmail(request.getParameter("email"));

			StudentDAO.insertData(s);
			response.sendRedirect("show.jsp");

		} else if (action.equalsIgnoreCase("edit")) {
			Student s = new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("fname"));
			s.setPassword(request.getParameter("password"));
			s.setContact(Integer.parseInt(request.getParameter("contact")));
			s.setEmail(request.getParameter("email"));
			StudentDAO.updatedata(s);
			response.sendRedirect("show.jsp");

		}

		else if (action.equalsIgnoreCase("update")) {

			request.getRequestDispatcher("update.jsp").forward(request, response);

		} else if (action.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			StudentDAO.deleteData(id);
			response.sendRedirect("show.jsp");
		}
	}

}
