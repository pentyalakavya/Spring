package com.test.demo.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
    	  Message m=(Message) ac.getBean("mess");
    	  m.setMessage("Hello World");
    	  m.getMessage();
    	  Message m1=(Message) ac.getBean("mess");
    	  m1.getMessage();
    	  
    	  
    }
}
