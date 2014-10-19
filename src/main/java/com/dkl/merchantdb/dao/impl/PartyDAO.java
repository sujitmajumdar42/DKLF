package com.dkl.merchantdb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.IPartyDAO;
import com.dkl.merchantdb.dao.mapper.PartyMapper;
import com.dkl.merchantdb.to.PartyTO;

@Component
public class PartyDAO implements IPartyDAO {

	private static final String CREATE_QUERY = "insert into party values(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String READ_QUERY = "select * from party where party_id=?";
	private static final String READ_ALL_QUERY = "select * from party";
	private static final String UPDATE_QUERY = "update party set party_name=?,party_type=?"
			+ "party_street_name=?,party_city=?,"
			+ "party_phone=?,party_mod_date=?" + " where party_id=?";
	private static final String DELETE_QUERY = "delete from party where party_id=?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createParty(PartyTO partyTO) {
		return jdbcTemplate.update(
				CREATE_QUERY,
				new Object[] { partyTO.getPartyID(), partyTO.getCompanyID(),
						partyTO.getPartyName(), partyTO.getPartyType(),
						partyTO.getCityGroup(),partyTO.getLedgerGroupName(), partyTO.getStreetName(),
						partyTO.getCity(), partyTO.getTelephone(),
						partyTO.getCreationDate(), partyTO.getModifiedDate() });
	}

	@Override
	public PartyTO readParty(String partyID) {
		return jdbcTemplate.queryForObject(READ_QUERY,
				new Object[] { partyID }, new PartyMapper());
	}

	@Override
	public List<PartyTO> readAllParty() {
		return jdbcTemplate.query(READ_ALL_QUERY, new PartyMapper());
	}

	@Override
	public void updateParty(PartyTO partyTO) {
		jdbcTemplate.update(
				UPDATE_QUERY,
				new Object[] { partyTO.getPartyName(), partyTO.getPartyType(),
						partyTO.getStreetName(), partyTO.getCity(),
						partyTO.getTelephone(), partyTO.getModifiedDate(),
						partyTO.getPartyID() });

	}

	@Override
	public void deleteParty(String partyID) {
		jdbcTemplate.update(DELETE_QUERY,new Object[]{partyID});

	}

}
