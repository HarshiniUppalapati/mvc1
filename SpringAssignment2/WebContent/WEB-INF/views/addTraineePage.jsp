<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Trainee Details</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
	<form:form action="addTrainee" method="post" modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee Id:</td>
				<td><form:input path="traineeId" size="30" /></td>
				<td><form:errors path="traineeId" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Trainee Name:</td>
				<td><form:input path="traineeName" size="30" /></td>
				<td><form:errors path="traineeName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Trainee Location:</td>
				<td><input type="radio" name="traineeLocation" value="Chennai">Chennai<br></td>

				<td><input type="radio" name="traineeLocation"
					value="Banglore">Banglore<br></td>
				
				<td><input type="radio" name="traineeLocation" value="Pune">Pune<br></td>
				
				<td><input type="radio" name="traineeLocation" value="Mumbai">Mumbai<br></td>
				
			</tr>
			<tr>
				<td>Trainee Domain:</td>
				<td><select name="traineeDomain" />
					<option value="JEE">JEE</option>
					<option value="Java">Java</option>
					<option value="C#">C#</option>
			</tr>
			<tr>
			<td><input type="submit" value="Add Trainee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>