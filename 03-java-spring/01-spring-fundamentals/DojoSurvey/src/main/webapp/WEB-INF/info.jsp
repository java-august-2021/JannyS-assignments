<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info Page</title>
</head>
<body>
<h1>Welcome Ninja</h1>
<p>Name: <c:out value="${name}"/></p>
<p>Location: <c:out value="${city}"/></p>
<p>Favorite Language: <c:out value="${lang}"/></p>
<p>Comment: <c:out value="${comment}"/></p>
</body>
</html>