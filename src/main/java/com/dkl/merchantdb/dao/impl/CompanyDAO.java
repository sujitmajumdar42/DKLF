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

	private static final String VIEW_COMPANY = "select company_id,company_name,company_street_name,company_city,"
											  + "company_state,company_pin,company_tin,company_phone,company_email,"
											  + "company_slips_ind,company_creation_date,company_mod_date from company";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int createCompany(CompanyTO companyTO) {
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
}
