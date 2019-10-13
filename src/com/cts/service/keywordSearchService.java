package com.cts.service;

import java.util.List;

import com.cts.bean.UploadBean;

public interface keywordSearchService {
	public String keywordSearch(String keyword);
	
	public List<UploadBean> getAllCourses();
}
