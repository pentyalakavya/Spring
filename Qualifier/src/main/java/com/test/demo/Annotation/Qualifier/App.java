package com.test.demo.Annotation.Qualifier;

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
    	 ApplicationContext context = new ClassPathXmlApplicationContext("BeanQ.xml");

         Profile profile = (Profile) context.getBean("profile");
         profile.printAge();
         profile.printName();
    }
}
