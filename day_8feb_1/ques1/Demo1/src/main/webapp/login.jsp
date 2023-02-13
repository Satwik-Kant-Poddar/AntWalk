<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>login page</h2>
	<%
String arr[][] = new String[5][2];
arr[0][0] = "satwik@gmail.com";
arr[0][1] = "satwik@123";
arr[1][0] = "vir@gmail.com";
arr[1][1] = "vir@123";
arr[2][0] = "a@gmail.com";
arr[2][1] = "a@123";
String a = request.getParameter("email");
String b = request.getParameter("pass");
if (a.isBlank() || b.isBlank()) {
	out.println("<h3>null value</h3>");
}else{
	int flag = 0;
	for (int i = 0; i < 3; i++) {

		if (a.equals(arr[i][0])) {
			flag = 1;
			if (b.equals(arr[i][1])) {
		out.println("<h3>login complete</h3>");
		break;
			} else {

		out.println("<h3>wrong password</h3>");
		break;
			}
		}
	}

	if (flag == 0) {
		out.println("<div>invalid</div>");
	}
}

%>

</body>
</html>