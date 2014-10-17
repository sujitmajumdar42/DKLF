<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Company</title>
<script type="text/javascript""<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript"
	src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#viewCompany').dataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
				"url" : "http://localhost:8080/merchantdb/viewCompanyJSON",
				"type" : "POST"
			},
			"columns" : [ {
				"data" : "companyName"
			}, {
				"data" : "city"
			}, {
				"data" : "state"
			}, {
				"data" : "pinCode"
			}, {
				"data" : "tinNumber"
			}, {
				"data" : "phoneNumber"
			}, {
				"data" : "email"
			}, {
				"data" : "slipsIndicator"
			}, {
				"data" : "creationDate"
			}, {
				"data" : "modifiedDate"
			} ]
		});
	});
</script>
</head>
<body>
	<table id="viewCompany">
		<thead>
			<tr>
				<th>Name</th>
				<th>City</th>
				<th>State</th>
				<th>Pin</th>
				<th>TIN</th>
				<th>Phone</th>
				<th>E-Mail</th>
				<th>SlipsIndicator</th>
				<th>Creation Date</th>
				<th>Modified Date</th>
			</tr>
		</thead>
	</table>

</body>

</html>