package com.game.spring.basics.spring.learning.client.core;

import com.game.spring.basics.spring.learning.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan("com.game.spring.basics.spring.learning.scope")
public class XmlScopeApplication {
static private Logger logger = LoggerFactory.getLogger(XmlScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		//ApplicationContext maintains all the beans
		XmlPersonDAO componentDao =applicationContext.getBean(XmlPersonDAO.class);
		XmlPersonDAO componentDao2 =applicationContext.getBean(XmlPersonDAO.class);

		logger.info("{}", componentDao);
		logger.info("{}", componentDao.getXmlJdbcConnection());
		logger.info("{}", componentDao2);
		logger.info("{}", componentDao2.getXmlJdbcConnection());
	}
}
