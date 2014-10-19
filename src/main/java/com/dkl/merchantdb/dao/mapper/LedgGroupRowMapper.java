package com.dkl.merchantdb.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dkl.merchantdb.to.LedgGroupTO;

public class LedgGroupRowMapper implements RowMapper<LedgGroupTO> {

	@Override
	public LedgGroupTO mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		LedgGroupTO ledgGroupTO = new LedgGroupTO();
		ledgGroupTO.setLedgGroupID(resultSet.getLong("LEDGER_GRP_ID"));
		ledgGroupTO.setCompanyID(resultSet.getLong("COMPANY_ID"));
		ledgGroupTO.setLedgGroupName(resultSet.getString("LEDGER_GRP_NAME"));
		ledgGroupTO.setLedgGroupType(resultSet.getString("LEDGER_GRP_TYPE"));
		ledgGroupTO.setLedgCreateDate(resultSet
				.getString("LEDGER_GRP_CRT_DATE"));
		ledgGroupTO.setLedgModDate(resultSet.getString("LEDGER_GRP_MOD_DATE"));
		return ledgGroupTO;
	}
}
