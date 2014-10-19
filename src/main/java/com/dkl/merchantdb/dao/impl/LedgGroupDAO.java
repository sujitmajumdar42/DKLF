package com.dkl.merchantdb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.ILedgGroupDAO;
import com.dkl.merchantdb.dao.mapper.LedgGroupRowMapper;
import com.dkl.merchantdb.to.LedgGroupTO;

@Component
public class LedgGroupDAO implements ILedgGroupDAO {

	private static String CREATE_QUERY = "INSERT INTO DKLF.LEDGER_GROUP VALUES(?,?,?,?,?,?)";

	private static String READ_QUERY = "SELECT * FROM DKLF.LEDGER_GROUP WHERE LEDGER_GRP_ID = ?";

	private static String READ_ALL_QUERY = "SELECT * FROM DKLF.LEDGER_GROUP";

	private static String UPDATE_QUERY = "UPDATE DKLF.LEDGER_GROUP SET LEDGER_GRP_NAME = ?,"
			+ "LEDGER_GRP_TYPE = ?,"
			+ "LEDGER_GRP_MOD_DATE = ?"
			+ " WHERE LEDGER_GRP_ID = ?";
	private static String DELETE_QUERY = "DELETE FROM DKLF.CITY_GROUP WHERE CITY_GROUP_ID = ?";

	private static String READBY_FK_QUERY = "SELECT * FROM DKLF.LEDGER_GROUP WHERE COMPANY_ID = ?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(LedgGroupTO ledgGroupTO) {
		System.out.println("ID ="+ledgGroupTO.getLedgGroupID());
		jdbcTemplate.update(
				CREATE_QUERY,
				new Object[] { ledgGroupTO.getLedgGroupID(),
						ledgGroupTO.getCompanyID(),
						ledgGroupTO.getLedgGroupName(),
						ledgGroupTO.getLedgGroupType(),
						ledgGroupTO.getLedgCreateDate(),
						ledgGroupTO.getLedgModDate() });

	}

	@Override
	public LedgGroupTO read(int ledgGroupID) {
		return jdbcTemplate.queryForObject(READ_QUERY,
				new Object[] { ledgGroupID }, new LedgGroupRowMapper());
	}

	@Override
	public List<LedgGroupTO> readAll() {
		return jdbcTemplate.query(READ_ALL_QUERY, new LedgGroupRowMapper());
	}

	@Override
	public void update(LedgGroupTO ledgGroupTO) {
		jdbcTemplate.update(
				UPDATE_QUERY,
				new Object[] { ledgGroupTO.getLedgGroupName(),
						ledgGroupTO.getLedgGroupType(),
						ledgGroupTO.getLedgModDate(),
						ledgGroupTO.getLedgGroupID() });
	}

	@Override
	public void delete(String ledgGroupID) {
		jdbcTemplate.update(DELETE_QUERY, ledgGroupID);

	}

	@Override
	public List<LedgGroupTO> readByFK(int companyID) {
		return jdbcTemplate.query(READBY_FK_QUERY, new Object[] { companyID },
				new LedgGroupRowMapper());
	}

}
