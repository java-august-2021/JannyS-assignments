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
<h1>New Product</h1>
			<a href="/Catagory">Make a new Catagory</a>
			<form:form class="form" action="/showproduct" method="post" modelAttribute="product">
				<div class="form-group row">
					<form:label path="name">Product:</form:label>
					<form:input type="text" path="name"/>
				</div>
				<div class="form-group row">
					<form:label path="description">Description:</form:label>
					<form:input type="text" path="description"/>
				</div>
				<input type="submit" class="btn btn-primary" value="Create"/>
			</form:form>
</body>
</html>