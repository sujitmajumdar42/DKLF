package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.SequenseGenDAO;
import com.dkl.merchantdb.dao.intf.IPartyDAO;
import com.dkl.merchantdb.to.PartyTO;
import com.dkl.merchantdb.util.DklUtil;

@Component
public class PartyBO {

	@Autowired
	private IPartyDAO partyDAO;

	@Autowired
	private SequenseGenDAO sequenseGenDAO;

	public int createParty(PartyTO partyTO) {
		partyTO.setPartyID(sequenseGenDAO.getSequenceID("PARTY_ID", "PARTY"));
		partyTO.setCreationDate(DklUtil.getTodayDate());
		partyTO.setModifiedDate(DklUtil.getTodayDate());
		return partyDAO.createParty(partyTO);
	}

	public PartyTO readParty(String partyID) {
		return partyDAO.readParty(partyID);
	}

	public List<PartyTO> readAllParty() {
		return partyDAO.readAllParty();
	}

	public void update(PartyTO partyTO) {
		partyDAO.updateParty(partyTO);
	}

	public void delete(String partyID) {
		partyDAO.deleteParty(partyID);
	}
}
