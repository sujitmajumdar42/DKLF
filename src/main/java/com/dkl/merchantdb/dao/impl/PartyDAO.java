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

	private static final String CREATE_QUERY = "insert into party values(?,?,?,?,?,?,?)";

	private static final String SELECT_QUERY = "select * from party";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createParty(PartyTO partyTO) {
		return	jdbcTemplate.update(CREATE_QUERY, partyTO.getPartyName(), partyTO.getPartyType(), partyTO.getStreetName(),
				partyTO.getCity(), partyTO.getTelephone(), partyTO.getLedgerGroupName(), partyTO.getCityGroup());
	}

	@Override
	public List<PartyTO> viewParties() {
		
		return jdbcTemplate.query(SELECT_QUERY, new PartyMapper());
	}

}
