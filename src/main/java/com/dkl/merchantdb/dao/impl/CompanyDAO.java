package com.dkl.merchantdb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.ICompanyDAO;
import com.dkl.merchantdb.dao.mapper.CompanyMapper;
import com.dkl.merchantdb.to.CompanyTO;
import com.dkl.merchantdb.util.DklUtil;

@Component
public class CompanyDAO implements ICompanyDAO {

	private static final String CREATE_COMPANY = "insert into company values(?,?,?,?,?,?,?,?,?,?,?,?)";

	private static final String VIEW_COMPANY = "select company_id,company_name,company_street_name,company_city,"
			+ "company_state,company_pin,company_tin,company_phone,company_email,"
			+ "company_slips_ind,company_creation_date,company_mod_date from company where company_id=?";
	private static final String VIEW_COMPANY_LIST = "select * from company";

	private static final String UPDATE_COMPANY = "UPDATE COMPANY SET COMPANY_NAME=?,"
			+ "COMPANY_STREET_NAME=?,"
			+ "company_city=?,"
			+ "company_state=?,"
			+ "company_pin=?,"
			+ "company_tin=?,"
			+ "company_phone=?,"
			+ "company_email=?,"
			+ "company_slips_ind=?,"
			+ "company_mod_date=?" + "where company_id = ?";

	private static final String DELETE_QUERY = "DELETE FROM DKLF.COMPANY WHERE COMPANY_ID = ?";

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
	public CompanyTO viewCompany(String cityGroupID) {
		// return jdbcTemplate.queryForObject(VIEW_COMPANY, new Object[]{}, new
		// CompanyMapper());
		return jdbcTemplate.queryForObject(VIEW_COMPANY,
				new Object[] { cityGroupID }, new CompanyMapper());
	}

	@Override
	public List<CompanyTO> viewCompanyList() {

		return jdbcTemplate.query(VIEW_COMPANY_LIST, new CompanyMapper());
	}

	@Override
	public void update(CompanyTO companyTO) {
		jdbcTemplate.update(
				UPDATE_COMPANY,
				new Object[] { companyTO.getCompanyName(),
						companyTO.getStreetName(), companyTO.getCity(),
						companyTO.getState(), companyTO.getPinCode(),
						companyTO.getTinNumber(), companyTO.getPhoneNumber(),
						companyTO.getEmail(), companyTO.getSlipsIndicator(),
						DklUtil.getTodayDate(), companyTO.getCompanyID() });

	}

	@Override
	public void delete(String companyID) {
		jdbcTemplate.update(DELETE_QUERY, new Object[] { companyID });
	}
}
