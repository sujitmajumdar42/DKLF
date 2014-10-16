package com.dkl.merchantdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dkl.merchantdb.bo.PartyBO;
import com.dkl.merchantdb.to.PartyTO;

@Controller
public class PartyController {

	@Autowired
	PartyBO partyBO;

	@RequestMapping(value = "/createParty")
	public String createParty() {
		return "createParty";
	}

	@RequestMapping(value = "/saveParty")
	public String saveParty(PartyTO partyTO, Model model) {
		int rowCount = partyBO.createParty(partyTO);
		if (rowCount > 0) {
			model.addAttribute("partyCreationStatus", "Company " + partyTO.getPartyName() + "has created successfully.");
		}
		return "createParty";
	}

	@RequestMapping(value = "/viewParty")
	public String viewParty() {
		return "viewParty";
	}

//	@RequestMapping(value = "/viewPartyJSON")
//	@ResponseBody
//	public String viewPartyJSON(Model model) {
//		List<PartyTO> partyTOs = partyBO.viewAllParties();
//		PartyJSON partyJSON = new PartyJSON();
//		partyJSON.setDraw(1);
//		partyJSON.setRecordsFiltered(10);
//		partyJSON.setRecordsTotal(10);
//		partyJSON.setData(partyTOs);
//		Gson gson = new Gson();
//		return gson.toJson(partyJSON);
//	}
}
