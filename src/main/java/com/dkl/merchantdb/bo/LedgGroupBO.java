package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.LedgGroupDAO;
import com.dkl.merchantdb.dao.impl.SequenseGenDAO;
import com.dkl.merchantdb.to.LedgGroupTO;
import com.dkl.merchantdb.util.DklUtil;

@Component
public class LedgGroupBO {

	@Autowired
	LedgGroupDAO ledgGroupDAO;
	
	@Autowired
	SequenseGenDAO SequenseGenDAO;
	
	public void create(LedgGroupTO ledgGroupTO){
		ledgGroupTO.setLedgGroupID(SequenseGenDAO.getSequenceID("LEDGER_GRP_ID", "LEDGER_GROUP"));
		ledgGroupTO.setLedgCreateDate(DklUtil.getTodayDate());
		ledgGroupTO.setLedgModDate(DklUtil.getTodayDate());
		ledgGroupDAO.create(ledgGroupTO);
	}
	
	public LedgGroupTO read(int ledgGroupID){
		return ledgGroupDAO.read(ledgGroupID);
	}
	
	public List<LedgGroupTO> readAll(){
		return ledgGroupDAO.readAll();
	}
	
	public void update(LedgGroupTO ledgGroupTO){
		ledgGroupTO.setLedgModDate(DklUtil.getTodayDate());
		ledgGroupDAO.update(ledgGroupTO);
	}
	
	public void delete(String ledgGroupID){
		ledgGroupDAO.delete(ledgGroupID);
	}
	
	public List<LedgGroupTO> readByFK(int companyID){
		return ledgGroupDAO.readByFK(companyID);
	}
}
