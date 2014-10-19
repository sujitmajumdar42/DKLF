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
		companyTO.setCompanyID(resultSet.getLong("company_ID"));
		companyTO.setCompanyName(resultSet.getString("company_Name"));
		companyTO.setCity(resultSet.getString("company_city"));
		companyTO.setState(resultSet.getString("company_state"));
		companyTO.setStreetName(resultSet.getString("company_street_Name"));
		companyTO.setSlipsIndicator(resultSet.getString("company_slips_ind"));
		companyTO
				.setCreationDate(resultSet.getString("company_creation_Date"));
		companyTO.setModifiedDate(resultSet.getString("company_mod_Date"));
		companyTO.setEmail(resultSet.getString("company_email"));
		companyTO.setPhoneNumber(Long.toString(resultSet
				.getLong("company_phone")));
		companyTO.setPinCode(Integer.toString(resultSet.getInt("company_pin")));
		companyTO.setTinNumber(Long.toString(resultSet.getLong("company_tin")));
		return companyTO;
	}

}
