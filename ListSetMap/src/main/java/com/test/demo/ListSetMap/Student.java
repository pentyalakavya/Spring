package com.test.demo.ListSetMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private List<String> student;
private Set<String> students;
private int id;
private String name;
private Map company;

public void show() {
	System.out.println(student);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void getCompany() {
	System.out.println(company);
}

public void setCompany(Map company) {
	this.company = company;
}

public void setStudents(Set<String> students) {
	this.students = students;
}

public void show1() {
	System.out.println(students);
}

public void setStudent(List<String> student) {
	this.student = student;
}

}
