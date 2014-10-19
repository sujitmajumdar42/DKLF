package com.dkl.merchantdb.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.SequenseGenDAO;
import com.dkl.merchantdb.dao.intf.ICompanyDAO;
import com.dkl.merchantdb.to.CompanyTO;
import com.dkl.merchantdb.util.DklUtil;

@Component
public class CompanyBO {

	@Autowired
	private ICompanyDAO companyDAO;
	
	@Autowired
	private SequenseGenDAO sequenseGenDAO;
	
	public int createCompany(CompanyTO companyTO) {
		companyTO.setCompanyID(sequenseGenDAO.getSequenceID("company_id", "company"));
		companyTO.setCreationDate(DklUtil.getTodayDate());
		companyTO.setModifiedDate(DklUtil.getTodayDate());
		return companyDAO.createCompany(companyTO);
	}
	
	public CompanyTO viewCompany(String companyID){
		return companyDAO.viewCompany(companyID);
	}
	
	public List<CompanyTO> viewCompanyList() {
		return companyDAO.viewCompanyList();
	}
	
	public void updateCompany(CompanyTO companyTO){
		companyDAO.update(companyTO);
	}
	
	public void deleteCompany(String companyID){
		companyDAO.delete(companyID);
	}
}
