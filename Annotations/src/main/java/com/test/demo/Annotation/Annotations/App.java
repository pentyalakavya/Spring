package com.test.demo.Annotation.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService as=(AccountService) ac.getBean(AccountService.class);
        as.setService("Good service");
        as.getService();
        AccountService as1=(AccountService) ac.getBean(AccountService.class);
        as1.getService();
    }
}
