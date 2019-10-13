package com.cts.Dao;

import com.cts.bean.RegisterBean;

public interface RegisterDao {
	
    public boolean registerUser(RegisterBean bean);
    public RegisterBean getRegisterUserByEmailid(String emailID);
}
