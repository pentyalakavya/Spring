package com.test.demo.Day1Hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("AppConfig.xml");
      /*  Training tr1=(Training) context.getBean("training");
        tr1.getName();*/
    	/*Resource resource=new ClassPathResource("Spring.xml");
    	BeanFactory bf=new XmlBeanFactory(resource);*/
    	Employee e1=(Employee) context.getBean("empbean");
    	System.out.println(e1.getEmpname());
    	e1.getEmpid();
    	e1.getLocation();
    	System.out.println(e1.getDate());
    	/*Employee e2=(Employee) context.getBean("empbean1");
    	e2.getEmpname();
    	e2.getEmpid();
    	e2.getLocation();*/
    	Employee e2=(Employee) context.getBean("empbean2");
    	System.out.println(e2.getEmpname());
    	e2.getEmpid();
    	e2.getLocation();
    	System.out.println(e2.getDate());
    	
    }
}
