package com.test.demo.Annotation.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
        Helloworld obj=(Helloworld) context.getBean("helloworld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
