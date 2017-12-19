package com.test.demo.Annotation.CompAnn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Configuration
@Component
public class App 
{
	@Bean
	Message mockMessageService() {
		return new Message() {
			public String getMessage() {
				return "Hello World";
			}
		};
	}
    public static void main( String[] args )
    {
        ApplicationContext ac=new AnnotationConfigApplicationContext(App.class);
        PrintMessage printer=ac.getBean(PrintMessage.class);
        printer.printMessage();
    }
}
