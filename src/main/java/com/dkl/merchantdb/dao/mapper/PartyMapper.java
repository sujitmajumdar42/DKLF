package com.dkl.merchantdb.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dkl.merchantdb.to.PartyTO;

public class PartyMapper implements RowMapper<PartyTO> {

	@Override
	public PartyTO mapRow(ResultSet resultSet, int row) throws SQLException {

		PartyTO partyTO = new PartyTO();
		partyTO.setPartyID(resultSet.getLong("PARTY_ID"));
		partyTO.setCompanyID(resultSet.getLong("COMPANY_ID"));
		partyTO.setPartyName(resultSet.getString("PARTY_Name"));
		partyTO.setPartyType(resultSet.getString("PARTY_TYPE"));
		partyTO.setCityGroup(resultSet.getString("CITY_GROUP_NAME"));
		partyTO.setLedgerGroupName(resultSet.getString("LEDGER_GRP_NAME"));
		partyTO.setStreetName(resultSet.getString("PARTY_STREET_NAME"));
		partyTO.setCity(resultSet.getString("PARTY_CITY"));
		partyTO.setTelephone(resultSet.getString("PARTY_PHONE"));
		partyTO.setCreationDate(resultSet.getString("PARTY_CRT_DATE"));
		partyTO.setModifiedDate(resultSet.getString("PARTY_MOD_DATE"));
		return partyTO;
	}

}
