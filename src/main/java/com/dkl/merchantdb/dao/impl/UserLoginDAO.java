package com.dkl.merchantdb.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.intf.IUserLogin;
import com.dkl.merchantdb.dao.mapper.UserLoginMapper;
import com.dkl.merchantdb.to.UserLoginTO;

@Component
public class UserLoginDAO implements IUserLogin {

	private static String READ_QUERY = "SELECT * FROM user_login WHERE USR_USERNAME= ? AND USER_PASSWORD= ?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public UserLoginTO readUserLogin(String userName, String password) {
		UserLoginTO userLoginTO;
		try {
			userLoginTO = jdbcTemplate.queryForObject(READ_QUERY,new Object[]{userName, password},
					new UserLoginMapper());
		} catch (EmptyResultDataAccessException exception) {
			userLoginTO = null;
		}
		return userLoginTO;
	}

}
