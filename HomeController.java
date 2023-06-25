package com.example.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.student;
import com.example.serviceimplementation.studentServiceimpl;

//used to create or build restful API in declarative way 
//and it is a request handler and spring will do building and provide restful API at runtime
@RestController
//we are using postman to do operation so that we to add cross annotation
@CrossOrigin("*") //optional used to access with all port
public class HomeController {

	// to create the bean of implementation class at runtime
	@Autowired
	studentServiceimpl studentserviceImpl;

	// to call save method or to save new student
	@PostMapping(value = "savestudent")
	public student savestudent(@RequestBody student student) {
		// lets try it work
		System.out.println("student saved");
		studentserviceImpl.savestudent(student);
		return student;
	}
    @PutMapping(value="updatestudent")
	public student updatestudent(@RequestBody student student) {
		return  studentserviceImpl.updatestudent(student);
	
	}
    @GetMapping("/getallstudent")
    public List<student> findallstudents(){
    	
    	return studentserviceImpl.findallstudents();
    }
    @DeleteMapping("/deletestudent")
    public void deletestudent(@RequestParam int id) {
    	studentserviceImpl.deletestudent(id);
    }
}
