<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ledger Group</title>
<script type="text/javascript" src="./js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="./css/jquery.dataTables.css">
<style type="text/css">
#dialog {
	font-size: 12px;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$('#viewLedgerGroup').dataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
				"url" : "/merchantdb/viewLedgerGroupJSON",
				"type" : "POST",
			},
			"columnDefs" : [ {
				"targets" : [ 0 ],
				"visible" : false,
				"searchable" : false
			} ,
		     {
				"targets" : [ 1 ],
				"visible" : false,
				"searchable" : false
			} ],
			"columns" : [ {
				"data" : "ledgGroupID"
			}, {
				"data" : "companyID"
			}, {
				"data" : "ledgGroupName"
			}, {
				"data" : "ledgGroupType"
			}]
		});
		var table = $('#viewLedgerGroup').DataTable();

		$('#viewLedgerGroup tbody').on('click', 'tr', function() {
			var rowData = table.row(this).data();
			$("#updateLedgerTable").show();
			$("[name = ledgGroupID]").val(rowData.ledgGroupID);
			$("[name = companyID]").val(rowData.companyID);
			$("[name = ledgGroupName]").val(rowData.ledgGroupName);
			$("[name= ledgGroupType]").val(rowData.ledgGroupType);
			$("#dialog").dialog();
		});
	});
</script>
</head>
<body>
    <a href="/merchantdb/createLedgerGroup?companyID=<%=request.getParameter("companyID")%>" style="text-decoration: none"><input type="button" value="Create Ledger Group"></a>
	<table id="viewLedgerGroup" class="display" cellspacing="0"
		width="100%">
		<thead>
			<tr>
				<th>Ledger ID</th>
				<th>Company ID</th>
				<th>Group Name</th>
				<th>Group Type</th>
			</tr>
		</thead>
	</table>
	<div id="dialog" title="Update Ledger Group" style="display: none">
		<form action="/merchantdb/updateLedgerGroup" method="post">
			<input type="hidden" name="companyID"> <input
				type="hidden" name="ledgGroupID">
			<table id="updateLedgerTable" >
				<tr>
					<td>Group Name :</td>
					<td><input type="text" name="ledgGroupName"></td>
				</tr>
				<tr>
					<td>Group Type :</td>
					<td><select name="ledgGroupType">
							<option value="select">Select</option>
							<option value="assets">Assests</option>
							<option value="liabilities">Liabilities</option>
							<option value="income">Income</option>
							<option value="expenditure">Expenditure</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save"><input
						type="reset" value="Clear"></td>
				</tr>
			</table>
		</form>
		<form action="/merchantdb/updateLedgerGroup" method="post">
			<input type="hidden" name="ledgGroupID"> <input type="submit"
				value="Remove" />
		</form>
	</div>
</body>
</html>