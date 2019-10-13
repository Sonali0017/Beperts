package com.cts.Dao;

import com.cts.bean.LoginBean;
import com.cts.bean.RegisterBean;

public interface LoginDao {
    public boolean validateUser(LoginBean bean);
    public String insertLogin(LoginBean bean);
    public String getUserType(String username);
    


}
