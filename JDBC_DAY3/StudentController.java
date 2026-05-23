package com.controllar;

import com.service.StudentService;

public class StudentController {
public static void main(String[] args) throws Exception {
	StudentService ss = new StudentService();
//	ss.insertData();
	//ss.Deletedata();
	//ss.UpdateData();
	//ss.getAlldata();
	ss.getSingleData();
}
}
