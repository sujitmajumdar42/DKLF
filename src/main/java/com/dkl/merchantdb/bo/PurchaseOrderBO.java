package com.dkl.merchantdb.bo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.PurchaseOrderDAO;
import com.dkl.merchantdb.to.PurchaseOrderTO;
import com.dkl.merchantdb.to.PurchaseOrderTOS;

@Component
public class PurchaseOrderBO {

	@Autowired
	PurchaseOrderDAO purchaseOrderDAO;

	public int[] savePurchases(PurchaseOrderTOS purchaseOrderTOs) {

		PurchaseOrderTO[] purchaseOrderTOArr = new PurchaseOrderTO[purchaseOrderTOs.getBillAmt().length];

		for (int i = 0; i < purchaseOrderTOs.getBillAmt().length; i++) {
			purchaseOrderTOArr[i] = new PurchaseOrderTO();
			purchaseOrderTOArr[i].setItemType(purchaseOrderTOs.getItemType()[i]);
			purchaseOrderTOArr[i].setItemName(purchaseOrderTOs.getItemName()[i]);
			purchaseOrderTOArr[i].setBond(purchaseOrderTOs.getBond()[i]);
			purchaseOrderTOArr[i].setPricePer(purchaseOrderTOs.getPricePer()[i]);
			purchaseOrderTOArr[i].setQuantity(purchaseOrderTOs.getQuantity()[i]);
			purchaseOrderTOArr[i].setStockPoint(purchaseOrderTOs.getStockPoint()[i]);
			purchaseOrderTOArr[i].setBillAmt(purchaseOrderTOs.getBillAmt()[i]);
			purchaseOrderTOArr[i].setBillPrice(purchaseOrderTOs.getBillPrice()[i]);
			purchaseOrderTOArr[i].setUnBillAmt(purchaseOrderTOs.getUnBillAmt()[i]);
			purchaseOrderTOArr[i].setFirm(purchaseOrderTOs.getFirm()[i]);
			purchaseOrderTOArr[i].setTotalAmt(purchaseOrderTOs.getTotalAmt()[i]);
			purchaseOrderTOArr[i].setWeight(purchaseOrderTOs.getWeight()[i]);
			purchaseOrderTOArr[i].setWeightDiff(purchaseOrderTOs.getWeightDiff()[i]);
		}
		return purchaseOrderDAO.saveOrders(Arrays.asList(purchaseOrderTOArr));
	}

	public PurchaseOrderDAO getPurchaseOrderDAO() {
		return purchaseOrderDAO;
	}

	public void setPurchaseOrderDAO(PurchaseOrderDAO purchaseOrderDAO) {
		this.purchaseOrderDAO = purchaseOrderDAO;
	}
}
