package com.dkl.merchantdb.to;

public class CityGroupTO extends MerchantBaseTO {

	private long companyID;
	private long cityGroupID;
	private String cityGroupName;

	public long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(long companyID) {
		this.companyID = companyID;
	}

	public long getCityGroupID() {
		return cityGroupID;
	}

	public void setCityGroupID(long cityGroupID) {
		this.cityGroupID = cityGroupID;
	}

	public String getCityGroupName() {
		return cityGroupName;
	}

	public void setCityGroupName(String cityGroupName) {
		this.cityGroupName = cityGroupName;
	}

}
