package com.dkl.merchantdb.dao.intf;

import java.util.List;

import com.dkl.merchantdb.to.LedgGroupTO;

public interface ILedgGroupDAO {
	
	void create(LedgGroupTO ledgGroupTO);
	LedgGroupTO read(int ledgGroupID);
	List<LedgGroupTO> readAll();
	void update(LedgGroupTO ledgGroupTO);
	void delete(String ledgGroupID);
	List<LedgGroupTO> readByFK(int companyID);
	
}
