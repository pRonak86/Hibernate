<html>
<body>
	<h2>Employee Registration</h2>
	<form action="EmpController" method="post">
		<table>
			<tr>
				<td>Name of Employee</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="econact"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="eemail"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="epassword"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Register"></td>
			</tr>


		</table>
	</form>

<a href="login.jsp">Login</a>
</body>
</html>
