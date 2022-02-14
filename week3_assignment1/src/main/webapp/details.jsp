<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<h1>Enter your name and marks</h1>
	<form action="Calculate" method="post">
         First name: <input type = "text" name = "first_name" /><br>
         Last name: <input type = "text" name = "last_name" /><br>
         Maths score: <input type = "text" name = "maths" /><br>
         English score: <input type = "text" name = "english" /><br>
         Hindi score: <input type = "text" name = "hindi" /><br>
         Physics score: <input type = "text" name = "physics" /><br>
         Chemistry score: <input type = "text" name = "chemistry" /><br>
         
         <input type = "submit" name = "Submit" />
      </form>
</body>
</html>