package com.test.demo.ImportConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean(name="servicebean1")
	public Services getServicebean1()
	{
		return new JDBCService();
	}
}
