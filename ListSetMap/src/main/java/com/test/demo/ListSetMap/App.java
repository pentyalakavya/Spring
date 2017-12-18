package com.test.demo.ListSetMap;

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
     ApplicationContext ac=new ClassPathXmlApplicationContext("Student.xml");
     Student s= (Student) ac.getBean("studbean");
     s.show();
     Student s1= (Student) ac.getBean("studbean1");
     s1.show1();
     Student s2=(Student) ac.getBean("studbean2");
     s2.getCompany();
    }
}
