package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.ICompanyDAO;
import com.dkl.merchantdb.to.CompanyTO;

@Component
public class CompanyBO {

	@Autowired
	private ICompanyDAO companyDAO;

	public int createCompany(CompanyTO companyTO) {
		return companyDAO.createCompany(companyTO);
	}
	
	public List<CompanyTO> viewCompany(){
		return companyDAO.viewCompany();
	}

//	public CompanyDAO getCompanyDAO() {
//		return companyDAO;
//	}
//
//	public void setCompanyDAO(CompanyDAO companyDAO) {
//		this.companyDAO = companyDAO;
//	}
}
