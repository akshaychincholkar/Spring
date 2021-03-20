package com.game.spring.basics.spring.learning.client.boot;

import com.game.spring.basics.spring.learning.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.game.spring.basics.spring.learning.properties")
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class)) {
			//ApplicationContext maintains all the beans
			SomeExternalService service=applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceUrl());
		}
//		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}
