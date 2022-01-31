<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<h2>Welcome ${name}  </h2>
	<h3>SessionName: ${sname}  </h3>
	<h3>CookieName: ${cname}  </h3>
	
	<h1>Enter your name and marks</h1>
	<form action="Calculate" method="post">
         First name: <input type = "text" name = "first_name" /><br><br>
         Last name: <input type = "text" name = "last_name" /><br><br>
         Maths score: <input type = "text" name = "maths" /><br><br>
         English score: <input type = "text" name = "english" /><br><br>
         Hindi score: <input type = "text" name = "hindi" /><br><br>
         Physics score: <input type = "text" name = "physics" /><br><br>
         Chemistry score: <input type = "text" name = "chemistry" /><br><br>
         
         <input type = "submit" name = "Submit" />
      </form>
</body>
</html>