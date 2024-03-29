<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:url action="empform" var="vempform"/>
	<s:a href="%{vempform}">show Employee Form</s:a>
	<br>
	<s:a href="studform"><s:url value="show student form"/></s:a>
	<br>
</body>
</html>