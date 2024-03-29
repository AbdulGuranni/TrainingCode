<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addDoctor">
	Enter doctorname<Input type="text" name="doctorName"><br>
	Enter doctorId<Input type="text" name ="doctorId"><br>
	Enter Speciality
        <select name="speciality">
            <option value="DERMATOLOGIST">DERMATOLOGIST</option>
            <option value="NEUROLOGIST">NEUROLOGIST</option>
            <option value="GYNAECOLOGIST">GYNAECOLOGIST</option>
            <option value="PEDIATRICIAN">PEDIATRICIAN</option>
            <option value="ORTHOPEDIC">ORTHOPEDIC</option>
        </select>
        <br>
    Enter Fees<input type="text" name="fees">
    Enter Ratings<input type="text" name="ratings">
    Enter experience<input type="text" name="experience">
    <input type="submit" value="submit">
	</form>
</body>
</html>