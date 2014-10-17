<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Company</title>
</head>
<body>
	<form action="/merchantdb/saveCompany" method="post">
		<center>
			<h3>Create Company</h3>
			<table align="center">
				<tr>
					<td colspan="2">${companyCreationStatus}<br> <br></td>
				</tr>
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
					<td><input type="radio" >Yes <input type="radio">No</td>
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