package com.cts.Dao;

import java.util.List;

import com.cts.bean.UploadBean;


public interface UploadDao {
       
       public boolean fileUpload(UploadBean upload);
       public List<UploadBean> getkeyword();
       public List<UploadBean> getAllSkillset();
       public int addUpload(UploadBean upload);
}
