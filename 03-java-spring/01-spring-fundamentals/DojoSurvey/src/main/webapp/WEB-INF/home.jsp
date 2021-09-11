<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Survey</title>
</head>
<body>
<h1>Hello Ninja!</h1>
<form action="/info">
<p> Name: <input type="text" name="name"> </p>
<p> Dojo Location:
	<select name="city">
	<option value="Seattle">Seattle</option>
	<option value="San Francisco">San Francisco</option>
	<option value="Austin">Austin</option>
	</select>
</p>
<p> Favorite Language:
	<select name="lang">
	<option value="java">Java</option>
	<option value="MERN">MERN</option>
	<option value="python">Python</option>
	</select>
</p>
<p> Comment (optional): <input type="textbox" name="comment"> </p>
<p><button>Submit</button></p>
</form>

</body>
</html>