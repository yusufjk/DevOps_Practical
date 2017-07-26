package com.yusufjk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ComponentTest {

	public static void main(String[] args){
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		EmpService empService=ctx.getBean(EmpService.class);
		empService.doTask();
	}
}
