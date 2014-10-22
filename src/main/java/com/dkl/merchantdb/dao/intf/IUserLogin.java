package com.dkl.merchantdb.dao.intf;

import com.dkl.merchantdb.to.UserLoginTO;

public interface IUserLogin {

	UserLoginTO readUserLogin(String userName, String password);
}
