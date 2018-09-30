<%@page import="bean.*"%>
<%@page import="java.util.*"%>
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
	width: 75%;
}

th {
	text-align: center;
	height: 50px;
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
</style>
</head>
<body>

	<%
		ArrayList<ChannelPackage> pacView = (ArrayList<ChannelPackage>) request
				.getAttribute("cPac");
		
	%>
	<center>
		<form action="<%=request.getContextPath()%>/ProductController"
			method="post">
			<h1 align="center">CHANNEL PACKAGE DETAILS</h1>
			<div style="overflow-x: auto">
				<table border="2" class="table">
					<tr>
						<th></th>
						<th>Name</th>
						<th>Category</th>
						<th>Charging Type</th>
						<th>Transmission Type</th>
						<th>Channels</th>
						<th>Cost</th>
						<th>From Date</th>
						<th>To Date</th>
						<th>Added</th>
					</tr>
					<%
						if (pacView != null) {
							for (ChannelPackage cp : pacView) {
					%>
					<tr>
						<td><input type="checkbox" name="id1"
							value="<%=cp.getPackId()%>"></td>
						<td><%=cp.getPacName()%></td>
						<td>
						<%
							for(String cat:cp.getPacCategory())
							{%>
								<%=cat%> 
							<%}
						%>
						</td>
						<td><%=cp.getPacChargingType()%></td>
						<td><%=cp.getPacTransmissionType()%></td>
						<td><%=cp.getPacChannels()%></td>
						<td><%=cp.getPacCost()%></td>
						<td><%=cp.getPacFromDate()%></td>
						<td><%=cp.getPacToDate()%></td>
						<td><%=cp.getPacAdded()%></td>
					</tr>
					<%
						}
						}
					%>
				</table>
			</div>
			<br> <input type="submit" name="action" value="UPDATE" />&nbsp
			&nbsp<input type="submit" name="action" value="DELETE" />
		</form>
	</center>
</body>
</html>