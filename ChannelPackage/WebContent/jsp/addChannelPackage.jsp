<%@ page import="java.util.*"%>
<%@ page import="bean.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous">
	
</script>
<script type="text/javascript">
function myFunction() {
	
    var check = document.form.check;
    
    var txt = "";
    var i;
    for (i = 0; i < check.length; i++) {
        if (check[i].checked) {
            txt = txt + check[i].value + "\n";
            
        }
    }
    document.getElementById("paccat").value =  txt;
    $("#myModal").modal('hide');
}
 $(document).ready(function() {
	$(".launch-modal").click(function() {
		$("#myModal").modal({
			backdrop : 'static'
		});
	});
}); 

	function formValidation() {
		var pname = document.myform.pname.value;
		var pcat = document.myform.pcat.value;
		var pchan = document.myform.pchan.value;
		var pcost = document.myform.pcost.value;
		var pfdate = document.myform.pfdate.value;
		var ptdate = document.myform.ptdate.value;
		var padded = document.myform.padded.value;
		if (pname == "") {
			alert("Enter package name");
			return false;
		} else if (pcat == "") {
			alert("Select package category");
			return false;
		} else if (pchan == "") {
			alert("Select package channels");
			return false;
		} else if (pcost == "") {
			alert("Enter cost");
			return false;
		} else {
			return true;
		}
	}
</script>
<style>
.bs-example {
	margin: 20px;
}

.alert {
	padding: 20px;
	background-color: #f44336;
	color: white;
	margin-bottom: 15px;
}

.closebtn {
	margin-left: 15px;
	color: white;
	font-weight: bold;
	float: right;
	font-size: 22px;
	line-height: 20px;
	cursor: pointer;
	transition: 0.3s;
}
</style>
</head>
<body>
	<%
	ArrayList<category1> alc3 = (ArrayList<category1>) request.getAttribute("catobj");
	ArrayList<channel> chann = (ArrayList<channel>) request.getAttribute("channDetails");
	%>
	<div class="alert">
		<span class="closebtn"
			onclick="this.parentElement.style.display='none';">&times;</span>
		This is an alert box.
	</div>
	<center>
		<form name="myform" action="<%=request.getContextPath()%>/ProductController" method="post" onSubmit="return formValidation()">
			<table border=1 width="45%" height="100%">
				<tr>
					<th colspan="2" align="left">Welcome Admin</th>
				</tr>
				<tr>
					<th colspan="2" align="center"><h3>Add Channel Package</h3></th>
				</tr>
				<tr>
					<th colspan="2" align="left">All fields are mandatory. Amount
						is in U.S dollars</th>
				</tr>
				<tr>
					<td>Package Name</td>
					<td><input type="text" name="pname" /></td>
				</tr>
				<tr>
					<td>Package Category</td>
					<td><textarea rows="5" cols="15" name="pcat" id="paccat" readonly></textarea><input
						type="button" class="btn btn-primary launch-modal"
						value="Add Category"></td>
				</tr>
				<tr>
					<td>Package Charging type</td>
					<td><input type="radio" name="pchartype" value="Paid" checked/>Paid
					    <input type="radio" name="pchartype" value="FTA" />FTA</td>
				</tr>
				<tr>
					<td>Package Transmission Type</td>
					<td><input type="radio" name="ptranstype"
						value="High Defination" checked />High Defination<input
						type="radio" name="ptranstype" value="Standard" />Standard</td>
				</tr>
				<tr>
					<td>Select Channels</td>
					<td><input type="text" name="pchan" required></td>
				</tr>
				<tr>
					<td>Package Cost</td>
					<td><input type="text" name="pcost" required></td>
				</tr>
				<tr>
					<td>Package Available From Date</td>
					<td><input type="date" name="pfdate" required></td>
				</tr>
				<tr>
					<td>Package Available To Date</td>
					<td><input type="date" name="ptdate" required></td>
				</tr>
				<tr>
					<td>Added by Default</td>
					<td><input type="radio" name="padded" value="Yes" checked/>Yes<input
						type="radio" name="padded" value="No" />No</td>
				</tr>
				<tr>
					<td align="center" colspan="2" height="5%"><input
						type="submit" name="action" class="btn btn-primary" value="ADD"></td>
				</tr>
			</table>
		</form>
	</center>
	<div class="bs-example">
		<!-- Button HTML (to Trigger Modal) -->
		<!-- Modal HTML -->
		
		<div id="myModal" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h4 class="modal-title">Select Package</h4>
					</div>
					<div class="modal-body">
						<form name="form" action="<%=request.getContextPath()%>/ProductController" method="post">
							<% 
								if (alc3 != null) {
							%>
							<%
								for (category1 alc4 : alc3) {
							%>
								<input type="checkbox" name="check" value="<%=alc4.getCat()%>"><%=alc4.getCat()%><br>
								<%
									}
								%>
								<%
									}
								%>
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<input type="button" class="btn btn-primary" name="action" onclick="myFunction()"
							value="Submit">
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>