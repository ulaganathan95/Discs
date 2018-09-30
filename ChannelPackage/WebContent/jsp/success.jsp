<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <center><h1> channel successfully added <%=request.getAttribute("channelid") %> </h1></center>
 <center><form action="<%=request.getContextPath()%>/ProductController" method="post">
<button type="submit" name="action" value="add">Add Channel Packages</button><br><br>
<button type="submit" name="action" value="view">View Channel Packages</button><br><br>
</form></center>
</body>
</html>