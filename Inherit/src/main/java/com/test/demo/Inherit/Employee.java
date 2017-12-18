package com.test.demo.Inherit;

public class Employee {
private String name;
private int id;
Address address;
public Employee()
{
	System.out.println("Def cons");
}
public Employee(int id)
{
	this.id=id;
}
public Employee(int id,String name)
{
	this.name=name;
}
public Employee(int id,String name,Address address)
{
	super();
	this.id=id;
	this.name=name;
	this.address=address;
}

void show()
{
	if(address==null)
		System.out.println(id+""+name+"");
	else
	System.out.println(id+""+name+""+address.showAddr());

}
}
