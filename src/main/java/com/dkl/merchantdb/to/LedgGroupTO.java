package com.dkl.merchantdb.to;

public class LedgGroupTO extends MerchantBaseTO{
	private long ledgGroupID;
	private long companyID;
	private String ledgGroupName;
	private String ledgGroupType;
	private String ledgCreateDate;
	private String ledgModDate;
	public long getLedgGroupID() {
		return ledgGroupID;
	}
	public void setLedgGroupID(long ledgGroupID) {
		this.ledgGroupID = ledgGroupID;
	}
	public long getCompanyID() {
		return companyID;
	}
	public void setCompanyID(long companyID) {
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
