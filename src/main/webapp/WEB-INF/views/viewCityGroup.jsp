<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery-1.11.1.min.js" /></script>
<script type="text/javascript" src="./js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="./js/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css"
	href="./css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="./css/jquery-ui.css">
<style type="text/css">
.ui-dialog .ui-dialog-content {
	background: none repeat scroll 0 0 transparent;
	border: 0 none;
	overflow: auto;
	padding: 0.5em 1em;
	position: relative;
	font-size: 0.7em;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$('#viewCityGroup').dataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
				"url" : "/merchantdb/viewCityGroupJSON",
				"type" : "POST"
			},
			"columns" : [ {
				"data" : "companyID"
			}, {
				"data" : "cityGroupID"
			}, {
				"data" : "cityGroupName"
			} ]
		});
		var table = $('#example').DataTable();
		var selected_row = null;
		$('#viewCityGroup').on('click', 'tr', function() {
			if (selected_row == null) {
				$(this).toggleClass('selected');
				selected_row = $(this);
			} else {
				$(selected_row).toggleClass('selected');
				$(this).toggleClass('selected');
				selected_row = $(this);
			}
		});

		$('#update').click(function() {
			if (selected_row == null) {
				$("#def_dialog_text").show();
				$("#UpdateTable").hide();
				$("#dialog").dialog();
			} else {
				$("#companyID").val(selected_row.find("td").eq(0).html());
				$("#cityGroupID").val(selected_row.find("td").eq(1).html());
				$("#cityGroupName").val(selected_row.find("td").eq(2).html());
				$("#def_dialog_text").hide();
				$("#UpdateTable").show();
				$("#dialog").dialog();
			}

			// 			if (selected_row != null)
			// 				alert(selected_row.find("td").eq(2).html());
		});
	});
</script>
</head>
<body>
	<input type="button" value="update" id="update" />
	<table id="viewCityGroup" class="display" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th>Company ID</th>
				<th>City Group ID</th>
				<th>City Group Name</th>
			</tr>
		</thead>

	</table>
	<div id="dialog" title="Update City Group"
		style="display: none; text-size: 10px">
		<p id="def_dialog_text" style="display: block">Please select data.</p>
		<form method="post" action="/merchantdb/updateCityGroup">
			<table id="UpdateTable" style="display: none">
				<tr>
					<td>Company ID</td>
					<td><input type="text" id="companyID" name="companyID"
						readonly /></td>
				</tr>
				<tr>
					<td>City Group ID</td>
					<td><input type="text" id="cityGroupID" name="cityGroupID"
						readonly /></td>
				</tr>
				<tr>
					<td>City Group Name</td>
					<td><input type="text" id="cityGroupName" name="cityGroupName" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Update"><input
						type="reset" value="Reset Data"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>