package com.test.demo.Day1Hello;

import java.util.Date;

public class Employee {
private String empname;
private String empid;
private String location;
private Date date;

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getEmpid() {
	return empid;
}

public void setEmpid(String empid) {
	this.empid = empid;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}
}
