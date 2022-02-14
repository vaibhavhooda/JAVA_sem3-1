<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area</title>
</head>
<body>

<%
	double tArea = (Double) request.getAttribute("tArea");
	double sArea = (Double) request.getAttribute("sArea");
%>



<label>Area of triangle is : </label>
<input type="text" value=<%=tArea%>><br><br>
<label>Area of square is : </label>
<input type="text" value=<%=sArea%>><br><br>



</body>
</html>