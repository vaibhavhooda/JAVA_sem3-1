<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>

<%
	String fName = (String) request.getAttribute("fName");
	String lName = (String) request.getAttribute("lName");
	String street = (String) request.getAttribute("street");
	String city = (String) request.getAttribute("city");
	String state = (String) request.getAttribute("state");
	String mScore = (String) request.getAttribute("mScore");
	String pScore = (String) request.getAttribute("pScore");
	String cScore = (String) request.getAttribute("cScore");
	String eScore = (String) request.getAttribute("eScore");
	String comScore = (String) request.getAttribute("comScore");
	String contact = (String) request.getAttribute("contact");
%>


<label>First name :</label>
<input type="text" value=<%=fName%>><br><br>
<label>Last name :</label>
<input type="text" value=<%=lName%>><br><br>
<label>Contact : </label>
<input type="text" value=<%=contact%>><br><br><br>
<h2>Address is as below</h2><br><br>
<label>Street :</label>
<input type="text" value=<%=street%>><br><br>
<label>City :</label>
<input type="text" value=<%=city%>><br><br>
<label>Province :</label>
<input type="text" value=<%=state%>><br><br><br>
<h2>Scores are as below</h2><br><br>
<label>Math scores : </label>
<input type="text" value=<%=mScore%>><br><br>
<label>Physics scores : </label>
<input type="text" value=<%=pScore%>><br><br>
<label>Chemistry scores : </label>
<input type="text" value=<%=cScore%>><br><br>
<label>English scores : </label>
<input type="text" value=<%=eScore%>><br><br>
<label>Computer scores : </label>
<input type="text" value=<%=comScore%>><br><br>



</body>
</html>