package com.test.demo.ImportConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
      Services s=(Services) ac.getBean("servicebean1");
      s.name();
      Services s1=(Services) ac.getBean("servicebean");
      s1.name();
      
    }
}
