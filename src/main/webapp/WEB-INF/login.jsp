<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<script type="text/javascript">
	function loginPage() {
		var uname = document.forms["form1"]["name"].value;
		var password = document.forms["form1"]["password"].value;
		if (uname == null || uname == "") {
			alert("Please provide Username");
			return false;
		}
		if (password == null || password == "") {
			alert("Please provide Password");
			return false;
		}
		document.form1.action = "userlogin.htm";
		document.form1.submit();
	}
</script>
<body>
	<form:form name="form1" modelAttribute="employee" method="POST">
		<h2>
			<center>employee Page</center>
		</h2>

		<div align="center">
			<form:errors id="InvalidUser" />
		</div>
		<table width="100%" height="150" align="center" border="0">
			<tr>
				<td width="50%" align="right">Grade</td>
				<td width="50%" align="left"><form:select path="grade">
						<form:options items="${grades}" />
					</form:select></td>
			</tr>
			<tr>
				<td width="50%" align="right">User Name</td>
				<td width="50%" align="left"><form:input path="name" size="25" /></td>
			</tr>
			<tr>
				<td width="50%" align="right">Password</td>
				<td width="50%" align="left"><form:password path="password"
						size="20" /></td>
			</tr>
			<tr>
				<td width="50%" align="right">Email</td>
				<td width="50%" align="left"><form:input path="email" size="50" /></td>
			</tr>
			<tr>
				<td width="50%" align="right">Hobbies</td>
				<td width="50%" align="left"><form:checkboxes items="${hobs}"
						path="hobbies" /></td>
			</tr>

			<tr>
				<td width="50%" align="right">Gender</td>
				<td width="50%" align="left"><form:radiobuttons path="gender"
						items="${genders}" /></td>
			</tr>
			<tr>
				<td width="50%" align="right">Gender</td>
				<td width="50%" align="left"><input type="button" value="Registor"
					onClick="javascript:loginPage();"></td>
				</td>
			</tr>
		</table>

	</form:form>
</body>
</html>