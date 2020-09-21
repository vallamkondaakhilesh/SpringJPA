<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>
<h2>Update Student Details</h2>
<form action="update" method="post">
<h2> updating student information of Id"<%=request.getParameter("id") %></h2>
<%
 request.setAttribute("id", request.getParameter("id"));
%>
Id:<input type="text" name="id" value="<%=request.getParameter("id") %>" readonly="readonly"><br>
Name:<input type="text" name="name"><br>
Dob:<input type="text" name="dob"><br>
Email:<input type="text" name="email"><br>
Mobile:<input type="text" name="mobile"><br>
<input type="submit" value="submit">&emsp;
<input type="reset" value="cancel">
</form>
</body>
</html>