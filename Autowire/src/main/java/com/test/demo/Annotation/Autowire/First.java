package com.test.demo.Annotation.Autowire;

public class First {
Second b;

First()
{
System.out.println("First is created");
}

public void getB() {
	System.out.println("Helloo");
}

public void setB(Second b) {
	this.b = b;
}

}