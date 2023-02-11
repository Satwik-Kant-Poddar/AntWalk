<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String pass = request.getParameter("password");
String gender = request.getParameter("gender");
String course = request.getParameter("course");
String terms = request.getParameter("check");
System.out.println(name +" "+ email+" "+pass+" "+gender+" "+course+" "+terms);
if(terms==null){
	out.println("<h2>Terms and Conditions not accepted</h2>");
}else{
	out.println("<h2>welcome to login page</h2>");
	out.println("name: "+name +"<br>email: "+ email+"<br>password: "+pass+"<br>gender: "+gender+"<br>course: "+course);
}
%>
</body>
</html>