<%@page import="bean.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table,th,td {
	border: px solid black;
}

table {
	border-collapse: collapse;
	width: 25%;
	position:center;
}

th {
	text-align: center;
	height: 50px;
	background-color: #00FFFF;
	text: solid white;
}

td {
	text-align: center;
	height: 25px;
	vertical-align: center;
}

th,td {
	padding: 5px;
}

tr:hover {
	background-color: #f1f1f1;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>
</head>
<body>
<% ChannelPackage chanPac = (ChannelPackage)request.getAttribute("chanPack");
%>
<form action="<%=request.getContextPath()%>/CustomerController" method="post">
<h2 align="center">UPDATE PAGE</h2>
<table border="1" align="center">
<%if(chanPac!=null)
{%>
<tr>
<td>Name</td><td><input type="text" name="pname" value="<%=chanPac.getPacName()%>"/></td>
</tr>

<tr>
<td>Category</td><td><input type="text" name="paccat" value="<%=chanPac.getPacCategory()%>"/></td>
</tr>

<tr>
<td>Charging Type</td><td><input type="text" name="pchartype" value="<%=chanPac.getPacChargingType()%>"/></td>
</tr>

<tr>
<td>Transmission Type</td><td><input type="text" name="ptranstype" value="<%=chanPac.getPacTransmissionType()%>" /></td>
</tr>

<tr>
<td>Channels</td><td><input type="text" name="pchan" value="<%=chanPac.getPacChannels()%>" /></td>
</tr>

<tr>
<td>Cost</td><td><input type="text" name="pcost" value="<%=chanPac.getPacCost()%>"/></td>
</tr>
<tr>
<td>From Date</td><td><input type="text" name="pfdate" value="<%=chanPac.getPacFromDate()%>"/></td>
</tr>

<tr>
<td>To Date</td><td><input type="text" name="ptdate" value="<%=chanPac.getPacToDate()%>"/></td>
</tr>

<tr>
<td>Added</td><td><input type="text" name="padded" value="<%=chanPac.getPacAdded()%>"/></td>
</tr>

<%} %>

</table><br>
<center><input type="Submit" name="source" value="UPDATE" />&nbsp &nbsp<input type="submit" name="source" value="View All Customer" /></center>
</form>
</body>
</html>