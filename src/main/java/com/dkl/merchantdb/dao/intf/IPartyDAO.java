package com.dkl.merchantdb.dao.intf;

import java.util.List;

import com.dkl.merchantdb.to.PartyTO;

public interface IPartyDAO {
	int createParty(PartyTO partyTO);
	
	List<PartyTO> viewParties();
}