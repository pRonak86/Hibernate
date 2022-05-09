<%@page import="com.DAO.StudentDAO"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="CSS/temp.css" rel="stylesheet" type="text/css">
<title>View All Data</title>
</head>
<body>
	<p>
	<h2 align="center">All Data</h2>
	<%
		List<Student> student = StudentDAO.getAllData();
	%>

	<table border="1" align="center" width="10px" bordercolor="black">
		<tr align="center">
			<th>ID</th>
			<th>Name</th>
			<th>Password</th>
			<th>Contact</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<%
			for (Student s : student) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getPassword()%></td>
			<td><%=s.getContact()%></td>
			<td><%=s.getEmail()%></td>
			<td>
			<form action="AcController" method="post">
					<input type="hidden" name="id" value="<%=s.getId()%>"> <input
						type="submit" name="action" value="Update">
				</form></td>
			<td><form action="AcController" method="post">
					<input type="hidden" name="id" value="<%=s.getId()%>"> <input
						type="submit" name="action" value="Delete">
				</form></td>
		</tr>

		<%
			}
		%>
	</table>

	<a href="index.jsp">Add New Student</a>





</body>
</html>