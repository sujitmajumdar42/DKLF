package com.dkl.merchantdb.to;

public class LedgGroupTO extends MerchantBaseTO{
	private String ledgGroupID;
	private String companyID;
	private String ledgGroupName;
	private String ledgGroupType;
	private String ledgCreateDate;
	private String ledgModDate;
	public String getLedgGroupID() {
		return ledgGroupID;
	}
	public void setLedgGroupID(String ledgGroupID) {
		this.ledgGroupID = ledgGroupID;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getLedgGroupName() {
		return ledgGroupName;
	}
	public void setLedgGroupName(String ledgGroupName) {
		this.ledgGroupName = ledgGroupName;
	}
	public String getLedgGroupType() {
		return ledgGroupType;
	}
	public void setLedgGroupType(String ledgGroupType) {
		this.ledgGroupType = ledgGroupType;
	}
	public String getLedgCreateDate() {
		return ledgCreateDate;
	}
	public void setLedgCreateDate(String ledgCreateDate) {
		this.ledgCreateDate = ledgCreateDate;
	}
	public String getLedgModDate() {
		return ledgModDate;
	}
	public void setLedgModDate(String ledgModDate) {
		this.ledgModDate = ledgModDate;
	}
	
	
}
