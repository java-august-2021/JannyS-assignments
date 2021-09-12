<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Coding Dojo!</h1>
<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${Language}" var="language">
				<tr>
					<td><a href="/${Language.id}">${Language.language}</a></td>
					<td>${Language.creator}</td>
					<td>${Language.version}</td>
					<td>
						<a class="btn btn-primary" href="/${ lang.id }/edit">Edit</a>
						<form id="delete-form" action="/${lang.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class="btn btn-danger" type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>