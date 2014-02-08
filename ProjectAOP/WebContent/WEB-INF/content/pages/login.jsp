<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AOP App</title>
</head>

<body>

	<h2>Login</h2>
	<s:form action="/login" method="post">
		<s:textfield name="name" label="Name" value="" cols="15" rows="1" />
		<s:textarea name="pass" label="Pass" value="" cols="15" rows="1" />
		<s:submit value="enter" />
	</s:form>


</body>
</html>