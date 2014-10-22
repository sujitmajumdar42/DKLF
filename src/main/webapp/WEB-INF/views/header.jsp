<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
	$(document).ready(function() {
		$("#usr_login").click(function() {
			$("#login_dialog").dialog();
		});
	});
</script>
<style>
#header {
	width: 100%;
	height: 100%;
	font-family: "Segoe UI";
}

#logo_img {
	width: 20%;
	height: 100%;
	color: #FFFFFF;
	font-size: 35px;
	text-align: center;
	float: left;
	margin-left: 30px;
	padding-top: 10px;
}

#usr_login {
	width: 20%;
	height: 100%;
	float: right
}
</style>
<div id="header">
	<div id="logo_img">
		Dintakurthi's
		<hr />
	</div>
	<div id="usr_login">
		<table style="margin-top: 30%; color: white;">
			<tr>
				<td><c:if test="${userDetail[0] != null}">
			    Welcome ${userDetail[0]}.
			 </c:if></td>
			</tr>
			<tr>
				<td><a href="/home" style="text-decoration: none; color: white">Home</a></td>
				<td>&nbsp;</td>
				<td><c:choose>
						<c:when test="${userDetail[0] != null}">
							<span id="logout" style="cursor: pointer;">LogOut</span>
						</c:when>
						<c:otherwise>
							<span id="login" style="cursor: pointer;">Login</span>
						</c:otherwise>
					</c:choose></td>
				<td>&nbsp;</td>
				<td style="cursor: pointer;">Contact Us</td>
			</tr>
		</table>
	</div>
</div>
<div id="login_dialog" title="Login User"
	style="display: none; font-size: 10px">
	<form method="post" action="/merchantdb/processLogin">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="userName" placeholder="User Name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					placeholder="password"></td>
			</tr>
			<tr>
				<td colspan="2">${loginStatus}</td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</div>
