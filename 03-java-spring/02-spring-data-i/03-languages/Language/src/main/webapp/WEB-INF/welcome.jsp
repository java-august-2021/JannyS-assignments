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
<h1>Welcome Ninja</h1>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>creator</th>
				<th>language</th>
				<th>version</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${Language}" var="language">
		<tr>
			<td><c:out value="${Language.creator}"/></td>
			<td><c:out value="${Language.language}"/></td>
			<td><c:out value="${Language.version}"/></td>
		</tr>
		</c:forEach>
		
		</tbody>
	</table>
</body>
</html>