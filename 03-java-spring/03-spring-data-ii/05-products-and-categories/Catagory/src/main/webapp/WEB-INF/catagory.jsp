<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/newProduct">Register a new Product</a>
			<h1>New Category</h1>
			
			<form:form class="form" action="/showcatagory" method="post" modelAttribute="category">
				<div class="form-group row">
					<form:label path="name">Catagory:</form:label>
					<form:input type="text" path="name"/>
				</div>
				<input type="submit" class="btn btn-primary" value="Create"/>
			</form:form>
</body>
</html>