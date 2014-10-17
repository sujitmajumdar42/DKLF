package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.ICompanyDAO;
import com.dkl.merchantdb.to.CompanyTO;
import com.dkl.merchantdb.util.DklUtil;

@Component
public class CompanyBO {

	@Autowired
	private ICompanyDAO companyDAO;

	public int createCompany(CompanyTO companyTO) {
		companyTO.setCompanyID(DklUtil.getCompID());
		companyTO.setCreationDate(DklUtil.getTodayDate());
		companyTO.setModifiedDate(DklUtil.getTodayDate());
		return companyDAO.createCompany(companyTO);
	}
	
	public List<CompanyTO> viewCompany(){
		return companyDAO.viewCompany();
	}
}
