package com.dkl.merchantdb.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dkl.merchantdb.to.CompanyTO;

public class CompanyMapper implements RowMapper<CompanyTO> {

	@Override
	public CompanyTO mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {

		CompanyTO companyTO = new CompanyTO();
		companyTO.setCompanyID(Integer.toString(resultSet.getInt("companyID")));
		companyTO.setCompanyName(resultSet.getString("companyName"));
		companyTO.setCity(resultSet.getString("City"));
		companyTO.setState(resultSet.getString("State"));
		companyTO.setStreetName(resultSet.getString("streetName"));
		companyTO.setSlipsIndicator(resultSet.getString("SlipsIndicator"));
		companyTO.setCreationDate(resultSet.getDate("creationDate"));
		companyTO.setModifiedDate(resultSet.getDate("modifiedDate"));
		companyTO.setEmail(resultSet.getString("email"));
		companyTO.setPhoneNumber(Long.toString(resultSet.getLong("Phone")));
		companyTO.setPinCode(Integer.toString(resultSet.getInt("pinCode")));
		companyTO.setTinNumber(Long.toString(resultSet.getLong("TIN")));
		return companyTO;
	}

}
