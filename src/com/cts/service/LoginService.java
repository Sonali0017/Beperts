package com.cts.service;

import com.cts.bean.LoginBean;
import com.cts.bean.RegisterBean;

public interface LoginService {
	public boolean validateUser(LoginBean bean);
	public String getUserType(String username);
	public RegisterBean getRegisterUserByEmailid(String emailID);

}
