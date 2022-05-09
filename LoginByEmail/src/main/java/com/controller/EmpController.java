package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.EmpDAO;
import com.bean.Employee;


public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {

			Employee e = new Employee();
			e.setEname(request.getParameter("ename"));
			e.setEcontact(request.getParameter("econtact"));
			e.setEemail(request.getParameter("eemail"));
			e.setEpassword(request.getParameter("epassword"));
			EmpDAO.insertdata(e);
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("login"))	
		{
			String email=request.getParameter("eemail");
			String password=request.getParameter("epassword");
			Employee employee = EmpDAO.getDataByEmail(email);
			String name=employee.getEname();
			System.out.println(name);
			if(employee.getEpassword().equals(password))
			{
			
				request.setAttribute("ename", name);
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			}
			else
			{
				out.print("Invalid Email or Password");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			
			
		}
	}

}
