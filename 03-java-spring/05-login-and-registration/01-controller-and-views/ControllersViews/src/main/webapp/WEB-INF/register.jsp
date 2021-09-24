<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register</h1>
<form:form class="register" action="/register" method="POST" modelAttribute="user">



<form:errors class="form_errors" path="fname" />
<form:input class="form_input" path="fname" type="text" placeholder="First Name"/>




<form:errors class="form_errors" path="lname" />
<form:input class="form_input" path="lname" type="text" placeholder="Last Name"/>

<form:errors class="form_errors" path="email" />
<form:input class="form_input" path="email" type="text" placeholder="Email"/>

<form:errors class="form_errors" path="password" />
<form:input class="form_input" path="password" type="password" placeholder="Password"/>


<form:errors class="form_errors" path="passwordConfirmation" />
<form:input class="form_input" path="passwordConfirmation" type="password" placeholder="Confirm Password"/>


<input class="form_submit" type="submit" value="Register"/>
</form:form>

<br>

<h1>Login</h1>
<form class="form" action="/login" method="POST">
<span class="login_error" >${error}</span>
<input class="form_input" type="email" name="email" placeholder="Email"/>

<input class="form_input" type="password" name="password" placeholder="Password"/>

<input class="form_submit" type="submit" value="Login"/>
</form>
</body>
</html>