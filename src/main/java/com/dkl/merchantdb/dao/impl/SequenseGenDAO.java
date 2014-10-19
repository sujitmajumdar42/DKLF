package com.dkl.merchantdb.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.IsequenceGenDAO;

@Component
public class SequenseGenDAO implements IsequenceGenDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public long getSequenceID(String column, String table) {
		long seqId = 1000001;
		try {
			String query = "SELECT MAX(" + table + "." + column + ") from "
					+ table;
			long id = jdbcTemplate.queryForObject(query, Long.class);
			seqId = ++id;
		} catch (NullPointerException exception) {
			System.out.println("Generating 1st Row..");
		}
		return seqId;
	}
}
