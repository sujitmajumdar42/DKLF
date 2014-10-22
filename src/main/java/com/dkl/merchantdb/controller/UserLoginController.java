package com.dkl.merchantdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dkl.merchantdb.bo.UserLoginBO;
import com.dkl.merchantdb.to.UserLoginTO;

@Controller
@SessionAttributes({ "userDetail", "companyDetails" })
public class UserLoginController {

	@Autowired
	UserLoginBO userLoginBO;

	@RequestMapping(value = "/processLogin")
	public ModelAndView processLogin(UserLoginTO userLoginTO, Model model) {

		ModelAndView modelAndView = new ModelAndView();

		UserLoginTO userLoginResponse = userLoginBO.processLogin(
				userLoginTO.getUserName(), userLoginTO.getPassword());
		if (userLoginResponse != null) {
			modelAndView.addObject("userDetail",
					new String[] { userLoginResponse.getUserID(),
							userLoginResponse.getUserName() });
			modelAndView.setViewName("home");
		} else {
			modelAndView.addObject("userDetail","Invalid credentials");
		}
		return modelAndView;
	}
}
