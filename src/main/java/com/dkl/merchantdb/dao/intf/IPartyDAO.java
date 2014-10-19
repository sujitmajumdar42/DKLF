package com.dkl.merchantdb.dao.intf;

import java.util.List;

import com.dkl.merchantdb.to.PartyTO;

public interface IPartyDAO {
	int createParty(PartyTO partyTO);

	PartyTO readParty(String partyID);

	List<PartyTO> readAllParty();

	void updateParty(PartyTO partyTO);

	void deleteParty(String partyID);
}