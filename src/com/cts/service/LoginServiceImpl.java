package com.cts.service;

import com.cts.Dao.LoginDao;
import com.cts.Dao.LoginDaoImpl;
import com.cts.Dao.RegisterDao;
import com.cts.Dao.RegisterDaoImpl;
import com.cts.bean.LoginBean;
import com.cts.bean.RegisterBean;

public class LoginServiceImpl  implements LoginService{
	LoginDao loginDao=(LoginDao) new LoginDaoImpl();
    RegisterDao registerDao=new RegisterDaoImpl();
    public boolean validateUser(LoginBean bean) {
                    // TODO Auto-generated method stub
                    return loginDao.validateUser(bean);
    }
                public String getUserType(String username) {
                      // TODO Auto-generated method stub
                      return loginDao.getUserType(username);
               }

	
                @Override
            	public RegisterBean getRegisterUserByEmailid(String emailID) {
            		// TODO Auto-generated method stub
            		return registerDao.getRegisterUserByEmailid(emailID);
            	}      

}
