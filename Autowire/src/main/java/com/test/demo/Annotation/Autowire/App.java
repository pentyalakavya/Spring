package com.test.demo.Annotation.Autowire;

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
        First f=(First) ac.getBean("abc");
        f.getB();
        
    }
}
