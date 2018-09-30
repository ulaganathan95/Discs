<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<script>
function myFunction() {
	
    var check = document.form.check;
    
    var txt = "";
    var i;
    for (i = 0; i < check.length; i++) {
        if (check[i].checked) {
            txt = txt + check[i].value + " ";
            
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
</script>
<style>
.bs-example {
	margin: 20px;
}
</style>
</head>
<body>
<!DOCTYPE html>
<html>
<body>
<form action="/action_page.php">
<br><br>
Package Category
<textarea rows="5" cols="15" id="paccat"></textarea>
<input type="button" class="btn btn-primary launch-modal" value="Add Category">
</form>
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
						<form name="form" action="#" method="post">
								<input type="checkbox" name="check" value="A">A<br>
								<input type="checkbox" name="check" value="B">B<br>
								<input type="checkbox" name="check" value="C">C<br>
								<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<input type="button" class="btn btn-primary" name="action" onclick="myFunction()"
							value="Submit">
							</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>