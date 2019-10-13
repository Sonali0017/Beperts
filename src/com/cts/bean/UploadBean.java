package com.cts.bean;

import java.io.InputStream;

public class UploadBean {
    private String keyword;
    private String skillname;
    private InputStream description;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public InputStream getDescription() {
		return description;
	}
	public void setDescription(InputStream description) {
		this.description = description;
	}
	public UploadBean(String keyword, String skillname, InputStream description) {
		super();
		this.keyword = keyword;
		this.skillname = skillname;
		this.description = description;
	}
	@Override
	public String toString() {
		return "UploadBean [keyword=" + keyword + ", skillname=" + skillname + ", description=" + description + "]";
	}
	
	
	
}