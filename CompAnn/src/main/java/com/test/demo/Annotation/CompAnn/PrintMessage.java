package com.test.demo.Annotation.CompAnn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintMessage {
final private Message service;
public PrintMessage(Message service)
{
	this.service=service;
}
@Autowired
public void printMessage()
{
	System.out.println("Message printed");
}
}
