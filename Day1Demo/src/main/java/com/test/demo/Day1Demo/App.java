package com.test.demo.Day1Demo;

import javax.swing.text.AbstractDocument.Content;

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
        Shape s=(Shape) ac.getBean("shapebean");
        s.draw();
        Shape s1=(Shape) ac.getBean("shapebean1");
        s1.draw();
    }
}
