<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Party</title>
<script>
	$(document).ready(
			function() {
				$.ajax({
					url : "viewLedgerGroupJSON",
					type : "POST",
					success : function(html) {
						var ledgerGrpList = jQuery.parseJSON(html).data;
						for (var i = 0; i < ledgerGrpList.length; i++) {
							$("#ledgerGroupName").append(
									'<option value='+ledgerGrpList[i].ledgGroupName+'>'
											+ ledgerGrpList[i].ledgGroupName
											+ '</option>');
						}
					}
				});
				$.ajax({
					url : "viewCityGroupJSON",
					type : "POST",
					success : function(html) {
						var cityGrpList = jQuery.parseJSON(html).data;
						for (var i = 0; i < cityGrpList.length; i++) {
							$("#cityGroup").append(
									'<option value='+cityGrpList[i].cityGroupName+'>'
											+ cityGrpList[i].cityGroupName
											+ '</option>');
						}
					}
				});
			});
</script>
</head>
<body>
	<form action="/merchantdb/saveParty" method="post">
	<input type="hidden" name="companyID" value="<%=request.getParameter("companyID")%>">
		<center>
			<h3>Create Party</h3>
			<table align="center">
				<tr>
					<td>Party Name</td>
					<td><input type="text" name="partyName" /></td>
				</tr>
				<tr>
					<td>Party Type</td>
					<td><select name="partyType">
							<option value="select">Select</option>
							<option value="Trade Creditor">Trade Creditor</option>
							<option value="Trade Debtor">Trade Debtor</option>
							<option value="Owner">Owner</option>
							<option value="Employee">Employee</option>
					</select></td>
				</tr>
				<tr>
					<td>Street Name</td>
					<td><input type="text" name="streetName" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>Telephone#</td>
					<td><input type="text" name="telephone" /></td>
				</tr>
				<tr>
					<td>Ledger Group Name</td>
					<td><select name="ledgerGroupName" id="ledgerGroupName">
							<option value="select">Select</option>
					</select></td>
				</tr>
				<tr>
					<td>City Group</td>
					<td><select name="cityGroup" id="cityGroup">
							<option value="select">Select</option>
					</select></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td colspan="2"><input type="Submit" value="Save"> <input
						type="reset" value="Clear"><input type="Button"
						value="Close"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>