package com.dkl.merchantdb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.ICompanyDAO;
import com.dkl.merchantdb.dao.mapper.CompanyMapper;
import com.dkl.merchantdb.to.CompanyTO;

@Component
public class CompanyDAO implements ICompanyDAO {

	private static final String CREATE_COMPANY = "insert into company values(?,?,?,?,?,?,?,?,?,?,?,?)";

	private static final String VIEW_COMPANY = "select companyid,companyname,streetname,city,state,pincode,tin,phone,email,slipsindicator,creationdate,modifieddate from company";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int createCompany(CompanyTO companyTO) {
		// jdbcTemplate.update(CREATE_COMPANY, companyTO);
		return jdbcTemplate.update(CREATE_COMPANY, companyTO.getCompanyID(),
				companyTO.getCompanyName(), companyTO.getStreetName(),
				companyTO.getCity(), companyTO.getState(),
				companyTO.getPinCode(), companyTO.getTinNumber(),
				companyTO.getPhoneNumber(), companyTO.getEmail(),
				companyTO.getSlipsIndicator(), companyTO.getCreationDate(),
				companyTO.getModifiedDate());
	}

	@Override
	public List<CompanyTO> viewCompany() {
		return jdbcTemplate.query(VIEW_COMPANY, new CompanyMapper());
	}

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

}
