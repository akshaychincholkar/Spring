package com.game.spring.basics.spring.learning;

import com.game.spring.basics.spring.learning.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {
static private Logger logger = LoggerFactory.getLogger(ScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
		//ApplicationContext maintains all the beans
		PersonDAO componentDao =applicationContext.getBean(PersonDAO.class);
		PersonDAO componentDao2 =applicationContext.getBean(PersonDAO.class);

		logger.info("{}", componentDao);
		logger.info("{}", componentDao.getJdbcConnection());
		logger.info("{}", componentDao2);
		logger.info("{}", componentDao2.getJdbcConnection());
	}
}
