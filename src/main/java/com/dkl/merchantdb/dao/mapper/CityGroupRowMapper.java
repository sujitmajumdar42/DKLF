package com.dkl.merchantdb.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dkl.merchantdb.to.CityGroupTO;

public class CityGroupRowMapper implements RowMapper<CityGroupTO> {

	@Override
	public CityGroupTO mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		CityGroupTO cityGroupTO = new CityGroupTO();
		cityGroupTO.setCompanyID(resultSet.getLong("company_ID"));
		cityGroupTO.setCityGroupID(resultSet.getLong("city_group_ID"));
		cityGroupTO.setCityGroupName(resultSet.getString("city_group_name"));
		return cityGroupTO;
	}
}
