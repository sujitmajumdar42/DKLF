package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.CityGroupDAO;
import com.dkl.merchantdb.to.CityGroupTO;

@Component
public class CityGroupBO {
	
	@Autowired
	CityGroupDAO cityGroupDAO;
	
	public void create(CityGroupTO cityGroupTO){
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
}
