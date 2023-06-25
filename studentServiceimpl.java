package com.example.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.student;

import com.example.repository.studentRepositoryi;
import com.example.serviceinteface.studentinterface;

@Component
public class studentServiceimpl implements studentinterface {

	@Autowired
	studentRepositoryi studentRep;
	@Override
	public student savestudent(student student) {
		// TODO Auto-generated method stub
	     studentRep.save(student);
		return student;
	}

	@Override
	public student updatestudent(student student) {
		// TODO Auto-generated method stub
		studentRep.save(student);
		return student;
	}

	@Override
	public List<student> findallstudents() {
		// it returns list so casting is needed
		return (List<student>) studentRep.findAll();
	}

	@Override
	public void deletestudent(int id) {
		// TODO Auto-generated method stub
		studentRep.deleteById(id);
	}

}
