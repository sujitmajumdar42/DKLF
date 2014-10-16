package com.dkl.merchantdb.dao.intf;

import java.util.List;

import com.dkl.merchantdb.to.PurchaseOrderTO;

public interface IPurchaseOrderDAO {

	int[] saveOrders(List<PurchaseOrderTO> purchaseOrders);
}
