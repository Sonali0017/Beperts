package com.cts.Dao;

import java.util.List;

import com.cts.bean.UploadBean;

public interface KeywordSearchDAO {
	public String keywordSearch(String keyword);
	public List<UploadBean> getAllCourses();


}
