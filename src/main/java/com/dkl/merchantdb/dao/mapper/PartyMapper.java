package com.dkl.merchantdb.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dkl.merchantdb.to.PartyTO;

public class PartyMapper implements RowMapper<PartyTO> {

	@Override
	public PartyTO mapRow(ResultSet resultSet, int row) throws SQLException {

		PartyTO partyTO = new PartyTO();
		partyTO.setCity(resultSet.getString("city"));
		partyTO.setCityGroup(resultSet.getString("cityGroup"));
		partyTO.setLedgerGroupName(resultSet.getString("ledgerGroupName"));
		partyTO.setPartyName(resultSet.getString("partyName"));
		partyTO.setPartyType(resultSet.getString("partyType"));
		partyTO.setStreetName(resultSet.getString("streetName"));
		partyTO.setTelephone(resultSet.getString("telephone"));
		return partyTO;
	}

}
