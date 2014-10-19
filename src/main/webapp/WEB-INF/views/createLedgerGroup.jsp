<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/merchantdb/saveLedgerGroup" method="post">
	<input type="hidden" name="companyID" value="<%=request.getParameter("companyID")%>">
		<table>
			<tr>
				<td>Group Name</td>
				<td><input type="text" name="ledgGroupName"></td>
			</tr>
			<tr>
				<td>Group Type</td>
				<td>
					<select name="ledgGroupType">
						<option value="select">Select</option>
						<option value="assets">Assests</option>
						<option value="liabilities">Liabilities</option>
						<option value="income">Income</option>
						<option value="expenditure">Expenditure</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save"><input type="reset" value="Clear"></td>
			</tr>
		</table>
	</form>
</body>
</html>