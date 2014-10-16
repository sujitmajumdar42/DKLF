package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.IPartyDAO;
import com.dkl.merchantdb.to.PartyTO;

@Component
public class PartyBO {

	@Autowired
	private IPartyDAO partyDAO;

	public int createParty(PartyTO partyTO) {
		return partyDAO.createParty(partyTO);
	}

	public List<PartyTO> viewAllParties() {
		return partyDAO.viewParties();
	}
}
