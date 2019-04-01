<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>Source</th><th>Destination</th><th>Date</th>
<th>Edit</th>
<th>Delete</th>
<c:forEach items="${bookings}" var="book">
	<tr>
		<td><span>${book.source}</span></td>
		<td><span>${book.destination}</span></td>
		<td><span>${book.date}</span></td>
		<td><a href="edit.do?ticket=${book.ticketNo}">edit</a></td>
		<td><a href="delete.do?ticket=${book.ticketNo}">delete</a></td>
	</tr>
	
</c:forEach>
</table>

<span></span>
</body>
</html>