package com.dkl.merchantdb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dkl.merchantdb.bo.CityGroupBO;
import com.dkl.merchantdb.to.CityGroupJSON;
import com.dkl.merchantdb.to.CityGroupTO;
import com.google.gson.Gson;

@Controller
public class CityGroupController {
	
	@Autowired
	CityGroupBO cityGroupBO;
	
	@RequestMapping(value="/createCityGroup")
	public String createCityGroup(CityGroupTO cityGroupTO){
		//cityGroupBO.create(cityGroupTO);
		return "createCityGroup";
	}
	
	@RequestMapping(value="/saveCityGroup")
	public String saveCityGroup(CityGroupTO cityGroupTO){
		cityGroupBO.create(cityGroupTO);
		return "createCityGroup";
	}
	
	@RequestMapping(value="/viewCityGroup")
	public String viewCityGroup(Model model){
		return "viewCityGroup";
	}
	
	@RequestMapping(value="/viewCityGroupJSON")
	@ResponseBody
	public String viewCityGroupJSON(Model model){
		CityGroupTO cityGroupTO = cityGroupBO.read("111");
		List<CityGroupTO> data = new ArrayList<CityGroupTO>();
		data.add(cityGroupTO);
		CityGroupJSON cityGroupJSON = new CityGroupJSON();
		cityGroupJSON.setDraw(1);
		cityGroupJSON.setRecordsFiltered(57);
		cityGroupJSON.setRecordsTotal(57);
		cityGroupJSON.setData(data);
		Gson gson = new Gson();
		return gson.toJson(cityGroupJSON);
	}
}
