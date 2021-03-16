package com.game.spring.basics.spring.learning;

import com.game.spring.basics.spring.learning.basic.BinarySearchImpl;
import com.game.spring.basics.spring.learning.basic.BubbleSortImpl;
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
		PersonDAO personDao=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2=applicationContext.getBean(PersonDAO.class);

		logger.info("{}",personDao);
		logger.info("{}",personDao.getJdbcConnection());
		logger.info("{}",personDao2);
		logger.info("{}",personDao2.getJdbcConnection());
	}
}
