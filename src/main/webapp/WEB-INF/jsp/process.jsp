<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Form Processing</h1>
 <p>
  <b>Welcome User :</b>
  <%=request.getParameter("id")%>
  <br/>
  <b>Your content is :</b>
  <%=request.getParameter("content")%>
 </p>
 <button onclick="history. back()">BACK</button>
</body>
</html>