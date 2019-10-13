package com.cts.service;

import com.cts.Dao.LoginDao;
import com.cts.Dao.LoginDaoImpl;
import com.cts.Dao.RegisterDao;
import com.cts.Dao.RegisterDaoImpl;
import com.cts.bean.LoginBean;
import com.cts.bean.RegisterBean;

public class RegisterServiceImpl implements RegisterService {
	RegisterDao registerDao = new RegisterDaoImpl();
	 LoginDao loginDao =  (LoginDao) new LoginDaoImpl();
    //LoginDao loginDao =  new LoginDaoImpl();
    
     public boolean registerUser(RegisterBean bean) {
          // TODO Auto-generated method stub
LoginBean loginBean = new LoginBean();
loginBean.setUserName(bean.getUserName());
loginBean.setPassword(bean.getPassword());
loginBean.setUserType(bean.getUserType());
          if(registerDao.registerUser(bean)&& "success".equals(loginDao.insertLogin(loginBean))){
                 return true;
          }
          else return false;
    }

	

}
