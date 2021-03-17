package com.game.spring.basics.spring.learning;

import com.game.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.game.spring.basics.componentscan")
public class ComponentScanApplication {
static private Logger logger = LoggerFactory.getLogger(ComponentScanApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);
		//ApplicationContext maintains all the beans
		ComponentDAO componentDao =applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDao2 =applicationContext.getBean(ComponentDAO.class);

		logger.info("{}", componentDao);
		logger.info("{}", componentDao.getComponentJdbcConnection());
		logger.info("{}", componentDao2);
		logger.info("{}", componentDao2.getComponentJdbcConnection());
	}
}
