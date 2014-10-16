package com.dkl.merchantdb.dao.intf;

import java.util.List;

import com.dkl.merchantdb.to.CompanyTO;

public interface ICompanyDAO {
	
	int createCompany(CompanyTO companyTO);

	List<CompanyTO> viewCompany();
}
