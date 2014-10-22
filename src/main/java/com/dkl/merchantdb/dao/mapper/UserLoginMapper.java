package com.dkl.merchantdb.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dkl.merchantdb.to.UserLoginTO;

public class UserLoginMapper implements RowMapper<UserLoginTO> {

	@Override
	public UserLoginTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserLoginTO userLoginTO = new UserLoginTO();
		userLoginTO.setUserName(rs.getString("USR_USERNAME"));
		userLoginTO.setPassword(rs.getString("USER_PASSWORD"));
		userLoginTO.setUserID(rs.getString("USR_USERID"));
		return userLoginTO;
	}

}
