<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="./css/jquery.dataTables.css">
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
			"columnDefs" : [ {
				"targets" : [ 0 ],
				"visible" : false,
				"searchable" : false
			}, {
				"targets" : [ 1 ],
				"visible" : false,
				"searchable" : false
			} ],
			"columns" : [ {
				"data" : "companyID"
			}, {
				"data" : "cityGroupID"
			}, {
				"data" : "cityGroupName"
			} ]
		});
		var table = $('#viewCityGroup').DataTable();
		$('#viewCityGroup tbody').on('click', 'tr', function() {
			var rowData = table.row(this).data();
			$("[name = companyID]").val(rowData.companyID);
			$("[name = cityGroupID]").val(rowData.cityGroupID);
			$("[name = cityGroupName]").val(rowData.cityGroupName);
			$("#dialog").dialog();
		});
	});
</script>
</head>
<body>
	<a
		href="/merchantdb/createCityGroup?companyID=<%=request.getParameter("companyID")%>"
		style="text-decoration: none;"> <input type="button"
		value="Create CityGroup"></a>
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
		<form method="post" action="/merchantdb/updateCityGroup">
			<input type="hidden" name="companyID" /> <input type="hidden"
				name="cityGroupID" />
			<table id="UpdateCGTable">
				<tr>
					<td>City Group Name</td>
					<td><input type="text" name="cityGroupName" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
		<form method="post" action="/merchantdb/deleteCityGroup">
			<input type="hidden" name="cityGroupID" />
			<table>
			 <tr>
			  <td><input type="submit" value="Remove City Group"></td>
			 </tr>
			</table>
		</form>
	</div>
</body>
</html>