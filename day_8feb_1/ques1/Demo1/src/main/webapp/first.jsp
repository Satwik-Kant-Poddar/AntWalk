<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
fuefrgyug
<%! int n =100; %>
<%!
int sq(int  n){
	return n*n;
}
%>
<%
int i = Integer.parseInt(request.getParameter("num1"));
System.out.println("hello from jsp");
out.println(i);
out.println(n);
out.println(sq(5));
try{
	int a = 9/0;
}catch(Exception e){
	System.out.println(e);

	out.println(e);
}
//int z=8/0;
%>
<br>
<%= "expression tag working" %>
<br>
<%= "value of "+n %>
<br>
<%= "square function "+sq(5) %>
</body>
</html>