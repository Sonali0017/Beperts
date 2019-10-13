package com.cts.service;

import java.util.List;

import com.cts.Dao.KeywordSearchDAO;
import com.cts.Dao.KeywordSearchDAOImpl;
import com.cts.bean.UploadBean;

public class keywordSearchServiceImpl implements keywordSearchService {
	
	KeywordSearchDAO keywordSearchDAO = new KeywordSearchDAOImpl();
	
	
	public String keywordSearch(String keyword)
	{
		return keywordSearchDAO.keywordSearch(keyword);
	}


	@Override
	public List<UploadBean> getAllCourses() {
		// TODO Auto-generated method stub
		return keywordSearchDAO.getAllCourses();
	}

}
