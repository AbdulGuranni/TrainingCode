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
	<s:form action="details">
	<s:textfield name="student.studentName" label="studentName"></s:textfield>
	<s:textfield name="student.studentId" label="studentId"></s:textfield>
	<s:textfield name="student.department" label="department"></s:textfield>
	<s:textfield name="student.city" label="city"></s:textfield>
	<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>