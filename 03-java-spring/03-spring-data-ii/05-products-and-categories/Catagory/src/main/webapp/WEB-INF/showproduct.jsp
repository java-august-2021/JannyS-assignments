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
<h1><c:out value="${product.name}"/></h1>
			
			<div>
				<h2>Catagories:</h2>
				<c:forEach items="${allCats}" var="catagory">
					<c:out value="${catagory.name}"/>
				</c:forEach>
			</div>
			
			<form class="form" action="/product/${product.id}" method="post"> 
				<div class="form-group row">
					<label path="catagories">Add Catagory:</label>
					<select name="catgories">
						<c:forEach items="${allNotCats}" var="catagory">
							<option value="${catagory.id}">
								<c:out value="${catagory.name}"/>
							</option>
						</c:forEach>
					</select>
				</div>				
				<input type="submit" class="btn btn-primary" value="Add"/>
			</form>
</body>
</html>