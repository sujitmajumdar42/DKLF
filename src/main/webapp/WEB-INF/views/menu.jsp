<script>
	$(document).ready(function() {
						$.ajax({
									url : "/merchantdb/viewCompanyListJSON",
									type : "POST",
									success : function(json) {
										var companyList = jQuery
												.parseJSON(json).data;
										for (var i = 0; i < companyList.length; i++) {
											$("#companyList")
													.append(
															'<li>'
																	+ companyList[i].companyName
																	+ '<ul style="width:150px">'+
																	'<li><a href="/merchantdb/viewCompany?companyID='+companyList[i].companyID+'">Edit</a></li>'
																   +'<li>Admin<ul style="width:150px"><li><a href="/merchantdb/viewCityGroup?companyID='+companyList[i].companyID+'">CityGroup</a></li><li><a href="/merchantdb/viewLedgerGroup?companyID='+companyList[i].companyID+'">Ledger Group</a></li><li><a href="/merchantdb/viewParty?companyID='+companyList[i].companyID+'">Party</a></li></ul>'
																	+ '</li></ul></li>');
										}
										$("#companyList").menu();
									}
								});
					});
</script>
<style type="text/css">
#companyList {
	font-size: 12px
}
</style>
<!-- 
<a href="/merchantdb/createCityGroup">Create CityGroup</a>
<a href="/merchantdb/viewCityGroup">view CityGroup</a>
<a href="/merchantdb/createLedgerGroup">Create LedgerGroup</a>
 -->
<!-- 
<ul>
	<li><a href="/merchantdb/viewCompany">Company</a>
		<ul>
			<li><a href="/merchantdb/createCompany">Create</a></li>
			<li><a href="/merchantdb/viewCompany">View/Update</a></li>
		</ul></li>
	<li><a href="/merchantdb/viewCityGroup">City Group</a>
		<ul>
			<li><a href="/merchantdb/createCityGroup">Create</a></li>
			<li><a href="/merchantdb/viewCityGroup">View/Update</a></li>
		</ul></li>
	<li><a href="/merchantdb/viewLedgerGroup">Ledger Group</a>
		<ul>
			<li><a href="/merchantdb/createLedgerGroup">Create</a></li>
			<li><a href="/merchantdb/viewLedgerGroup">View/Update</a></li>
		</ul></li>
	<li><a href="#">Party</a>
		<ul>
			<li><a href="#">Create</a></li>
			<li><a href="#">View/Update</a></li>
		</ul></li>
	<li><a href="#">Item Unit</a>
	<ul>
			<li><a href="#">Create</a></li>
			<li><a href="#">View/Update</a></li>
		</ul></li>
</ul>
 -->
<h4 style="text-align: center;">Companies</h4>
<hr />
<a style="text-decoration: none !important;"
	href="/merchantdb/createCompany"><input type="button"
	value="Create Company" /></a>
<ul id="companyList">
</ul>

