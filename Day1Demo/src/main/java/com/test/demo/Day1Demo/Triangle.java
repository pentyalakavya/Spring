package com.test.demo.Day1Demo;

public class Triangle implements Shape {
private String shapee;

public String getShapee() {
	return shapee;
}

public void setShapee(String shapee) {
	this.shapee = shapee;
}
public void draw()
{
	System.out.println("Draw triangle");
}
}
