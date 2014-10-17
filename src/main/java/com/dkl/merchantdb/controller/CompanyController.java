package com.dkl.merchantdb.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dkl.merchantdb.bo.CompanyBO;
import com.dkl.merchantdb.to.CompanyTO;
import com.dkl.merchantdb.to.JsonTemplateTO;
import com.google.gson.Gson;

@Controller
public class CompanyController {
	
	@Autowired
	CompanyBO companyBO;
	
	@RequestMapping(value = "/createCompany")
	public String createCompany(Locale locale, Model model) {
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

	@RequestMapping(value = "/viewCompanyJSON")
	@ResponseBody
	public String viewCompanyJSON(Model model) {
		JsonTemplateTO jsonTemplateTO = new JsonTemplateTO();
		jsonTemplateTO.setDraw(1);
		jsonTemplateTO.setRecordsFiltered(20);
		jsonTemplateTO.setRecordsTotal(20);
		List<CompanyTO> dataList = companyBO.viewCompany();
		jsonTemplateTO.setData(dataList.toArray(new CompanyTO[dataList.size()]));
		return new Gson().toJson(jsonTemplateTO);		
	}
	
}
