package com.example.serviceinteface;

import java.util.List;

import com.example.model.student;

public interface studentinterface {
   //to new student
	public student savestudent(student student);
	
	//to update student
	public student updatestudent(student student);
	
	//to fetch all student from database
	public List<student> findallstudents();
	
	//to delete student
	public void deletestudent(int id);
	
	
}
