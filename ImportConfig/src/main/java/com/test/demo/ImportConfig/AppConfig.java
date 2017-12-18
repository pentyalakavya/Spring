package com.test.demo.ImportConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BusinessConfig.class,MyConfig.class})
public class AppConfig {

}
