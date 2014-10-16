package com.dkl.merchantdb.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.IPurchaseOrderDAO;
import com.dkl.merchantdb.to.PurchaseOrderTO;

@Component
public class PurchaseOrderDAO implements IPurchaseOrderDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final String INSERT_QUERY = "insert into purchase_order values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

	@Override
	public int[] saveOrders(final List<PurchaseOrderTO> purchaseOrders) {

		return jdbcTemplate.batchUpdate(INSERT_QUERY, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement preparedStatement, int index) throws SQLException {

				PurchaseOrderTO purchaseOrder = purchaseOrders.get(index);
				preparedStatement.setString(1, purchaseOrder.getItemType());
				preparedStatement.setString(2, purchaseOrder.getItemName());
				preparedStatement.setString(3, purchaseOrder.getBond());
				preparedStatement.setString(4, purchaseOrder.getStockPoint());
				preparedStatement.setString(5, purchaseOrder.getQuantity());
				preparedStatement.setString(6, purchaseOrder.getWeight());
				preparedStatement.setString(7, purchaseOrder.getWeightDiff());
				preparedStatement.setString(8, purchaseOrder.getPricePer());
				preparedStatement.setString(9, purchaseOrder.getBillPrice());
				preparedStatement.setString(10, purchaseOrder.getBillAmt());
				preparedStatement.setString(11, purchaseOrder.getUnBillAmt());
				preparedStatement.setString(12, purchaseOrder.getTotalAmt());
				preparedStatement.setString(13, purchaseOrder.getFirm());

			}

			@Override
			public int getBatchSize() {
				return purchaseOrders.size();
			}
		});
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
