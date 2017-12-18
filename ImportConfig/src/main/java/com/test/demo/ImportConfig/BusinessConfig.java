package com.test.demo.ImportConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessConfig {
@Bean(name="servicebean")
public Services getServicebean()
{
	return new BusinessService();
}

}
