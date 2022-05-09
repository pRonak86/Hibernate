<!--
Author: Colorlib
Author URL: https://colorlib.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<%@page import="com.bean.Student"%>
<%@page import="com.DAO.StudentDAO"%>
<html>
<head>
<title>Student SignUp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript">
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<!-- Custom Theme files -->
<link href="CSS/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link
	href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i"
	rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<%
		int id=Integer.parseInt(request.getParameter("id"));
		Student s=StudentDAO.getStudentByID(id);
		
	%>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Student SingUP</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="AcController" method="post">
					<input class="text" type="text" name="id" value="<%=s.getId()%>"> <br>
					<input class="text" type="text" name="fname" required="" value="<%=s.getName()%>"> <br>
					<input class="text" type="password"	name="password" required="" value="<%=s.getPassword()%>"><br>
					<input class="text" type="text"	name="contact"  required="" value="<%=s.getContact()%>">
					<input class="text email" type="text" name="email"	required="" value="<%=s.getEmail()%>">
					
					
					<input type="submit" name="action" value="edit">
				</form>
	
			</div>
		</div>
	
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
</body>
</html>