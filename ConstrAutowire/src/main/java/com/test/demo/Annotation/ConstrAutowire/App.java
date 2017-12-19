package com.test.demo.Annotation.ConstrAutowire;


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
    	ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
        Employee e=(Employee) ac.getBean("abc");
       e.show();
    }
}
