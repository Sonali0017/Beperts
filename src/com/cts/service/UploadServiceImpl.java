package com.cts.service;

import java.util.List;

import com.cts.Dao.UploadDao;
import com.cts.Dao.UploadDaoImpl;
import com.cts.bean.UploadBean;
import com.cts.service.UploadService;

public class UploadServiceImpl implements UploadService {
UploadDao uploadDAO = new UploadDaoImpl();
	@Override
	public int addUpload(UploadBean upload) {
		// TODO Auto-generated method stub
		return uploadDAO.addUpload(upload);
	}
	
	
	
	
	
	
}
	