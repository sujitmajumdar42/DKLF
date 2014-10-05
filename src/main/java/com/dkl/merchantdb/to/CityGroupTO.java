package com.dkl.merchantdb.to;

public class CityGroupTO extends MerchantBaseTO {

	private String companyID;
	private String cityGroupID;
	private String cityGroupName;

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getCityGroupID() {
		return cityGroupID;
	}

	public void setCityGroupID(String cityGroupID) {
		this.cityGroupID = cityGroupID;
	}

	public String getCityGroupName() {
		return cityGroupName;
	}

	public void setCityGroupName(String cityGroupName) {
		this.cityGroupName = cityGroupName;
	}

}
