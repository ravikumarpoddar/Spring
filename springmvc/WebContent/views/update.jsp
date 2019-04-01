<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>



	<pre>
		<form action="../update.do?" method="put">
			Source: <input type="text" name="source" value="<c:out value="${param['source']}"></c:out>"/>
			Destination:<input type="text" name="destination" value="<c:out value="${param['dest']}"></c:out>"/>
			Date:<input type="text" name="date" value="<c:out value="${param['date']}"></c:out>"/>
			<button type="submit">update</button><button type="reset">cancel</button>
		</form>
		
	</pre>
	

</body>
</html>