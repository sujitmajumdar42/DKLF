package com.dkl.merchantdb.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dkl.merchantdb.bo.CompanyBO;
import com.dkl.merchantdb.to.CompanyTO;

@Controller
public class CompanyController {
	
	@Autowired
	CompanyBO companyBO;
	
	@RequestMapping(value = "/createCompany")
	public String createCompany(Locale locale, Model model) {

		// model.addAttribute("serverTime", formattedDate );
		System.out.println("createCompany");
		return "createCompany";
	}

	@RequestMapping(value = "/saveCompany")
	public String saveCompany(CompanyTO companyTO, Model model) {
		int rowCount = companyBO.createCompany(companyTO);
		if (rowCount > 0) {
			model.addAttribute("companyCreationStatus",
					"Company " + companyTO.getCompanyName()
							+ "has created successfully.");
		}
		return "createCompany";
	}

	@RequestMapping(value = "/viewCompany")
	public String viewCompany() {
		return "viewCompany";
	}

//	@RequestMapping(value = "/viewCompanyJSON")
//	@ResponseBody
//	public String viewCompanyJSON(Model model) {
//		List<CompanyTO> companyTOs = companyBO.viewCompany();
//		CompanyJSON companyJSON = new CompanyJSON();
//		companyJSON.setDraw(1);
//		companyJSON.setRecordsFiltered(57);
//		companyJSON.setRecordsTotal(57);
//		companyJSON.setData(companyTOs);
//		 
//		Gson gson = new Gson();
//		return gson.toJson(companyJSON);
//	}
	
}
