package com.test.demo.Annotation.ConstrAutowire;

public class Address {
private int hno;
private String location;
public Address()
{
	System.out.println("Default Cons");
}
public Address(int hno,String location)
{
	this.hno=hno;
	this.location=location;
}
public String showAddr()
{
	return hno+""+location;
}
}
