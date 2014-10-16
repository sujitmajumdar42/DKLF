package com.dkl.merchantdb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dkl.merchantdb.bo.CityGroupBO;
import com.dkl.merchantdb.to.CityGroupJSON;
import com.dkl.merchantdb.to.CityGroupTO;
import com.dkl.merchantdb.to.JsonTemplateTO;
import com.google.gson.Gson;

@Controller
public class CityGroupController {
	
	@Autowired
	CityGroupBO cityGroupBO;
	
	@RequestMapping(value="/createCityGroup")
	public String createCityGroup(CityGroupTO cityGroupTO){
		return "createCityGroup";
	}
	
	@RequestMapping(value="/saveCityGroup")
	public String saveCityGroup(CityGroupTO cityGroupTO){
		cityGroupBO.create(cityGroupTO);
		return "viewCityGroup";
	}
	
	@RequestMapping(value="/viewCityGroup")
	public String viewCityGroup(Model model){
		return "viewCityGroup";
	}
	
	@RequestMapping(value="/viewCityGroupJSON")
	@ResponseBody
	public String viewCityGroupJSON(Model model){
		
		JsonTemplateTO jsonTemplateTO = new JsonTemplateTO();
//		jsonTemplateTO.setDraw(1);
//		jsonTemplateTO.setRecordsFiltered(57);
//		jsonTemplateTO.setRecordsTotal(57);
//		jsonTemplateTO.setData(cityGroupBO.readAll());
		
		CityGroupJSON cityGroupJSON = new CityGroupJSON();
		cityGroupJSON.setDraw(1);
		cityGroupJSON.setRecordsFiltered(57);
		cityGroupJSON.setRecordsTotal(57);
		cityGroupJSON.setData(cityGroupBO.readAll());
		Gson gson = new Gson();
		return gson.toJson(cityGroupJSON);
	}
	
	@RequestMapping(value="/updateCityGroup")
	public String updateCityGroup(CityGroupTO cityGroupTO){
		cityGroupBO.update(cityGroupTO);
		return "viewCityGroup";
	}
}
