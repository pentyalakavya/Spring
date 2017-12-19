package com.test.demo.Annotation.Annotations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	public AccountService getAccountService()
	{
		return new AccountService();
		
	}
}
