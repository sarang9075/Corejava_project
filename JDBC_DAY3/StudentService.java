package com.service;

import com.dao.StudentDao;

public class StudentService {
public void insertData() throws Exception {
	StudentDao sd = new StudentDao();
	sd.insertData();
}
public void Deletedata() throws Exception {
	StudentDao sd = new StudentDao();
	sd.Deletedata();
}
public void UpdateData() throws Exception {
	StudentDao sd = new StudentDao();
	sd.UpdateData();

}
public void getAlldata() throws Exception {
	StudentDao sd = new StudentDao();
	sd.getAlldata();
}

public void getSingleData() throws Exception {
	StudentDao sd = new StudentDao();
	sd.getSingleData();
}	
}

