<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Final</title>
<link rel="stylesheet" href="final.css">
</head>
<body>

<%
	double avg = (Double) request.getAttribute("avg");
	String grade = (String) request.getAttribute("grade");
	double grade_point = (Double) request.getAttribute("grade_point");
%>

<img src="http://www.logo-designer.co/wp-content/uploads/2018/05/2018-lambton-college-new-logo-design.jpg"><br><br>

<h1>Final score report</h1><br><br><br><br><br><br>
<label>Average score is :</label>
<input type="text" value=<%=avg%>><br><br>
<label>Your grade is : </label>
<input type="text" value=<%=grade%>><br><br>
<label>Your grade point is : </label>
<input type="text" value=<%=grade_point%>><br><br><br><br>

<h3>Group members are:</h3>
<ul>
  <li>Aayush Rishi</li>
  <li>Dhimant Godhani</li>
  <li>Vaibhav Hooda</li>
  <li>Aditya Chauhan</li>
  <li>Ali Delavarian</li>
</ul> 

</body>
</html>