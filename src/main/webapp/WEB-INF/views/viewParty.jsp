<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Company</title>
<script type="text/javascript"
	src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#viewParty').dataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
				"url" : "http://localhost:8080/merchantdb/viewPartyJSON",
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
			}, {
				"targets" : [ 6 ],
				"visible" : false,
				"searchable" : false
			}, {
				"targets" : [ 7 ],
				"visible" : false,
				"searchable" : false
			}, {
				"targets" : [ 8 ],
				"visible" : false,
				"searchable" : false
			}],
			"columns" : [ {
				"data" : "partyID"
			}, {
				"data" : "companyID"
			}, {
				"data" : "partyName"
			}, {
				"data" : "partyType"
			}, {
				"data" : "ledgerGroupName"
			}, {
				"data" : "cityGroup"
			}, {
				"data" : "streetName"
			}, {
				"data" : "city"
			}, {
				"data" : "telephone"
			}]
		});
	});
</script>
</head>
<body>
	<a
		href="/merchantdb/createParty?companyID=<%=request.getParameter("companyID")%>"
		style="text-decoration: none"><input type="button"
		value="Create Party"></a>
	<table id="viewParty">
		<thead>
			<tr>
				<th>PartyID</th>
				<th>CompanyID</th>
				<th>PartyName</th>
				<th>PartyType</th>
				<th>LedgerGroupName</th>
				<th>CityGroup</th>
				<th>StreetName</th>
				<th>City</th>
				<th>Telephone#</th>
			</tr>
		</thead>
	</table>
</body>
</html>