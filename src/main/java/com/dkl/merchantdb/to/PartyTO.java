package com.dkl.merchantdb.to;

public class PartyTO extends MerchantBaseTO{

	long partyID;
	long companyID;
	String partyName;
	String partyType;
	String streetName;
	String city;
	String telephone;
	String ledgerGroupName;
	String cityGroup;
	String creationDate;
	String modifiedDate;

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public long getPartyID() {
		return partyID;
	}

	public void setPartyID(long partyID) {
		this.partyID = partyID;
	}

	public long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(long companyID) {
		this.companyID = companyID;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLedgerGroupName() {
		return ledgerGroupName;
	}

	public void setLedgerGroupName(String ledgerGroupName) {
		this.ledgerGroupName = ledgerGroupName;
	}

	public String getCityGroup() {
		return cityGroup;
	}

	public void setCityGroup(String cityGroup) {
		this.cityGroup = cityGroup;
	}

}
