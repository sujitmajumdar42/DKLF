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
	private static String READ_ALL_QUERY = "SELECT * FROM DKLF.CITY_GROUP";
	private static String UPDATE_QUERY = "UPDATE DKLF.CITY_GROUP SET CITY_GROUP_NAME = ? WHERE CITY_GROUP_ID=?";
	private static String DELETE_QUERY = "DELETE FROM `dklf`.`city_group` WHERE `CITY_GROUP_ID`=? ";
    
	@Override
	public void create(CityGroupTO cityGroupTO) {
		System.out.println(cityGroupTO.getCompanyID() + " : "
				+ cityGroupTO.getCityGroupID() + " : "
				+ cityGroupTO.getCityGroupName());
		jdbcTemplate.update(
				CREATE_QUERY,
				new Object[] { cityGroupTO.getCityGroupID(),
						cityGroupTO.getCompanyID(),
						cityGroupTO.getCityGroupName() });

	}

	@Override
	public CityGroupTO read(String cityGroupID) {
		return jdbcTemplate.queryForObject(READ_QUERY,
				new Object[] { cityGroupID }, new CityGroupRowMapper());
	}

	@Override
	public List<CityGroupTO> readAll() {
		return jdbcTemplate.query(READ_ALL_QUERY, new CityGroupRowMapper());
	}

	@Override
	public void update(CityGroupTO cityGroupTO) {
		jdbcTemplate.update(
				UPDATE_QUERY,
				new Object[] { cityGroupTO.getCityGroupName(),
						cityGroupTO.getCityGroupID() });

	}

	@Override
	public void delete(String cityGroupID) {
		jdbcTemplate.update(DELETE_QUERY,new Object[]{cityGroupID});
	}

}
