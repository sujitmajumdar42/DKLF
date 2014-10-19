package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.CityGroupDAO;
import com.dkl.merchantdb.dao.impl.SequenseGenDAO;
import com.dkl.merchantdb.to.CityGroupTO;

@Component
public class CityGroupBO {
	
	@Autowired
	CityGroupDAO cityGroupDAO;
	
	@Autowired
	private SequenseGenDAO sequenseGenDAO;
	
	public void create(CityGroupTO cityGroupTO){
		cityGroupTO.setCityGroupID(sequenseGenDAO.getSequenceID("CITY_GROUP_ID", "CITY_GROUP"));
		cityGroupDAO.create(cityGroupTO);
	}
	
	public CityGroupTO read(String cityGroupID){
		return cityGroupDAO.read(cityGroupID);
	}
	
	public List<CityGroupTO> readAll(){
		return cityGroupDAO.readAll();
	}
	public void update(CityGroupTO cityGroupTO){
		cityGroupDAO.update(cityGroupTO);
	}
	public void delete(String cityGroupID){
		cityGroupDAO.delete(cityGroupID);
	}
}
