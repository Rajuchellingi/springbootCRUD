package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table", catalog = "student_database")
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private int roll;
   private String name;
   private String addr;
public student() {
	super();
	
}
public student(int id, int roll, String name, String addr) {
	super();
	this.id = id;
	this.roll = roll;
	this.name = name;
	this.addr = addr;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
   
}
