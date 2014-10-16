<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ledger Group</title>
<link rel="stylesheet" type="text/css"
	href="./css/jquery.dataTables.css">
<script type="text/javascript" src="./js/jquery-1.11.1.min.js" /></script>
<script type="text/javascript" src="./js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#viewLedgerGroup').dataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
				"url" : "/merchantdb/viewLedgerGroupJSON",
				"type" : "POST"
			},
			"columns" : [ {
				"data" : "ledgGroupID"
			}, {
				"data" : "ledgGroupName"
			}, {
				"data" : "ledgGroupType"
			} ]
		});
	});
</script>
</head>
<body>
	<table id="viewLedgerGroup" class="display" cellspacing="0"
		width="100%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Group Name</th>
				<th>Group Type</th>
			</tr>
		</thead>
	</table>
</body>
</html>