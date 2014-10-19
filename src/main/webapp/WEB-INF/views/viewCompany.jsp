<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Company</title>
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
<script>
 $(document).ready(function(){
	 $.ajax({
		 url : 'viewCompanyJSON?companyID=<%=request.getParameter("companyID")%>',
									type : "POST",
									success : function(json) {
										var company = jQuery.parseJSON(json);
										$("input[name='companyID']").val(
												company.companyID);
										$("input[name='companyName']").val(
												company.companyName);
										$("input[name='streetName']").val(
												company.streetName);
										$("input[name='city']").val(
												company.city);
										$("input[name='state']").val(
												company.state);
										$("input[name='pinCode']").val(
												company.pinCode);
										$("input[name='email']").val(
												company.email);
										$("input[name='phoneNumber']").val(
												company.phoneNumber);
										$("input[name='tinNumber']").val(
												company.tinNumber);
										$(
												"input[name='slipsIndicator'][value='"
														+ company.slipsIndicator
														+ "']").prop("checked",
												true);
									}
								});
					});
</script>
</head>
<body>
	<form action="/merchantdb/updateCompany" method="post">
		<input type="hidden" name="companyID">
		<center>
			<h3>Update Company</h3>
			<table align="center">
				<tr>
					<td>Company Name</td>
					<td><input type="text" name="companyName" /></td>
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
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Pincode</td>
					<td><input type="text" name="pinCode" /></td>
				</tr>
				<tr>
					<td>E-Mail</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phoneNumber" /></td>
				</tr>
				<tr>
					<td>TIN Number</td>
					<td><input type="text" name="tinNumber" /></td>
				</tr>
				<tr>
					<td>Ship System</td>
					<td><input type="radio" name="slipsIndicator" value="Yes">Yes
						<input type="radio" name="slipsIndicator" value="No">No</td>
				</tr>
				<tr>
					<td colspan="2"><input type="Submit" value="Update"></td>
				</tr>
			</table>
		</center>
	</form>
	<form method="post" action="/merchantdb/deleteCompany">
		<input type="hidden" name="companyID">
		<table align="center">
			<tr>
				<td><input type="submit" value="Remove Company"></td>
			</tr>
		</table>
	</form>
</body>

</html>