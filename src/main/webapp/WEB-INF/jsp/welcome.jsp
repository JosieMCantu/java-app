<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<%
// debug
System.out.println("webapp / WEB-INF / jsp / welcome.jsp ");
%>
<body>
    <h1>Form Processing</h1>
    <form action="process" method="GET">
        ID: <input type="text" name="id"> <br /><br/>
        Content : <input type="text" name="content" ><br/><br/> 
    <input type="submit" value="Submit" />
    <input type="reset" value="Reset" />
 </form>
</body>
</html>