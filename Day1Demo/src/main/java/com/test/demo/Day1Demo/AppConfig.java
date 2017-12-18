package com.test.demo.Day1Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean(name="shapebean")
public Shape getShape()
{
	return new Triangle();
}
@Bean(name="shapebean1")
	public Shape getShape1()
	{
		return new Circle();
	}
}

