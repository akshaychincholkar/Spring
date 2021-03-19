package com.game.spring.basics.spring.learning.client.boot;

import com.game.spring.basics.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.game.spring.basics.cdi")
public class CdiApplication {
static private Logger logger = LoggerFactory.getLogger(CdiApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CdiApplication.class, args);
		//ApplicationContext maintains all the beans
		SomeCdiBusiness business =applicationContext.getBean(SomeCdiBusiness.class);

		logger.info("{} -> DAO {}", business,business.getSomeCDIDAO());
	}
}
