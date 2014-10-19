package com.dkl.merchantdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dkl.merchantdb.bo.LedgGroupBO;
import com.dkl.merchantdb.to.JsonTemplateTO;
import com.dkl.merchantdb.to.LedgGroupTO;
import com.google.gson.Gson;

@Controller
public class LedgeGroupController {

	@Autowired
	LedgGroupBO ledgGroupBO;
	
	@RequestMapping(value="/createLedgerGroup")
	public String createLedgerGroup(LedgGroupTO ledgGroupTO){
		return "createLedgerGroup";
	}
	
	@RequestMapping(value="/saveLedgerGroup")
	public String saveLedgerGroup(LedgGroupTO ledgGroupTO){
		ledgGroupBO.create(ledgGroupTO);
		return "viewLedgerGroup";
	}
	
	@RequestMapping(value="/viewLedgerGroup")
	public String viewLedgerGroup(Model model){
		return "viewLedgerGroup";
	}
	
	@RequestMapping(value="/viewLedgerGroupJSON")
	@ResponseBody
	public String viewLedgerGroupJSON(){
		JsonTemplateTO jsonTemplateTO = new JsonTemplateTO();
		jsonTemplateTO.setDraw(1);
		jsonTemplateTO.setRecordsTotal(10);
		jsonTemplateTO.setRecordsFiltered(10);
		List<LedgGroupTO> dataList = ledgGroupBO.readAll();
		jsonTemplateTO.setData(ledgGroupBO.readAll().toArray(new LedgGroupTO[dataList.size()]));
		return new Gson().toJson(jsonTemplateTO);
	}
	
	@RequestMapping(value="/updateLedgerGroup")
	public String updateLedgerGroup(LedgGroupTO ledgGroupTO){
		ledgGroupBO.update(ledgGroupTO);
		return "viewLedgerGroup";
	}
	
	@RequestMapping(value="/deleteLedgerGroup")
	public String deleteLedgerGroup(@RequestParam("ledgGroupID") String ledgGroupID){
		ledgGroupBO.delete(ledgGroupID);
		return "viewLedgerGroup";
	}
	
}
