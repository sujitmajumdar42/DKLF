package com.dkl.merchantdb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.IcityGroupDAO;
import com.dkl.merchantdb.dao.mapper.CityGroupRowMapper;
import com.dkl.merchantdb.to.CityGroupTO;

@Component
public class CityGroupDAO implements IcityGroupDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static String CREATE_QUERY = "INSERT INTO DKLF.CITY_GROUP VALUES(?,?,?)";
    private static String READ_QUERY = "SELECT * FROM DKLF.CITY_GROUP WHERE CITY_GROUP_ID = ?";
	
	@Override
	public void create(CityGroupTO cityGroupTO) {
		jdbcTemplate.update(CREATE_QUERY,
							new Object[]{cityGroupTO.getCompanyID(),
										 cityGroupTO.getCityGroupID(),
										 cityGroupTO.getCityGroupName()});
		
	}

	@Override
	public CityGroupTO read(String cityGroupID) {
		return jdbcTemplate.queryForObject(READ_QUERY,new Object[]{cityGroupID}, new CityGroupRowMapper());
	}

	@Override
	public List<CityGroupTO> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CityGroupTO cityGroupTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CityGroupTO cityGroupTO) {
		// TODO Auto-generated method stub
		
	} 
	
	 

}
