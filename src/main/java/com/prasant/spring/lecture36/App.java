package com.prasant.spring.lecture36;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lecture36.xml");
		
		
		Robot robot = (Robot) context.getBean("robot");
		robot.speak();
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
