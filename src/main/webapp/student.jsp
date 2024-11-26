<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebApp Template</title>
</head>
<body>
	<label for = "firstname">Firstname</label>
	<input type = "text" id = "firstname" value = "<%= request.getAttribute("firstname") %>" readonly><br> 
	<label for = "lastname">Lastname</label>
	<input type = "text" id = "lastname" value = "<%= request.getAttribute("lastname") %>" readonly><br>
</body>
</html>