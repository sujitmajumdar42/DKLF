<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" "<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#viewCityGroup').dataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
				"url" : "http://localhost:8080/merchantdb/viewCityGroupJSON",
				"type" : "POST"
			},
			"columns" : [ {
				"data" : "companyID"
			}, {
				"data" : "cityGroupID"
			}, {
				"data" : "cityGroupName"
			}]
		});
	});

</script>
</head>
<body>
	<table id="viewCityGroup" class="display" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th>Company ID</th>
				<th>City Group ID</th>
				<th>City Group Name</th>
			</tr>
		</thead>

	</table>
</body>
</html>