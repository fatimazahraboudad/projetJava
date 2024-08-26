package com.ioc.configurationbeanxml;

import com.ioc.configurationbeanxml.tp.TpController;
import com.ioc.configurationbeanxml.tp.TpEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConfigurationBeanXmlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ConfigurationBeanXmlApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring2.xml");

		TpController tpServices = (TpController) context.getBean("tpController");
		

		tpServices.getAllTpEntities(new TpEntity("1", "TP1")).forEach(tpEntity -> System.out.println("Name: " + tpEntity.getName()));
	}

}
