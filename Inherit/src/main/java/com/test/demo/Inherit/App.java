package com.test.demo.Inherit;

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
    	ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
    	Employee e3=(Employee) context.getBean("empbean2");
    	e3.show();
    	Employee e4=(Employee) context.getBean("empbean3");
    	e4.show();
    }
}
