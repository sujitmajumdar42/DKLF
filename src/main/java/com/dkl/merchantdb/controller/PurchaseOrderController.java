package com.dkl.merchantdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dkl.merchantdb.bo.PurchaseOrderBO;
import com.dkl.merchantdb.to.PurchaseOrderTOS;

@Controller
public class PurchaseOrderController {

	@Autowired
	PurchaseOrderBO purchaseOrderBO;

	@RequestMapping(value = "/purchaseOrder")
	public String purchaseOrder() {
		return "purchaseOrder";
	}

	@RequestMapping(value = "/savePurchaseOrder")
	public String savePurchaseOrder(PurchaseOrderTOS purchaseOrderTO, Model model) {
		if (purchaseOrderBO.savePurchases(purchaseOrderTO).length > 0) {
			model.addAttribute("success", "PurchaseOrder saved successfully.");
		}
		return "purchaseOrder";
	}
}
