package com.dkl.merchantdb.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dkl.merchantdb.dao.impl.UserLoginDAO;
import com.dkl.merchantdb.to.UserLoginTO;

@Component
public class UserLoginBO {

	@Autowired
	UserLoginDAO userLoginDAO;
	
	public UserLoginTO processLogin(String userName, String password){
		return userLoginDAO.readUserLogin(userName, password);
	}
}
