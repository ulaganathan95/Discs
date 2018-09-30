<%@ page import ="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
/* String name="Gowtham";
PrintWriter pw=response.getWriter();
pw.println(name);
request.setAttribute("name1", name); */
String A = request.getParameter("check1");
request.setAttribute("name1", A);
String B = request.getParameter("check2");
request.setAttribute("name2", B); 
request.getRequestDispatcher("channelPackage_copy.jsp").forward(request,response);
%>
</body>
</html>