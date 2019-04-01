package com.app.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNavy {
	
	public static void main(String[] args) {
		
		String xml="beans.xml";
		//create obj of Application context
		ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
		NavyBean navy=ac.getBean("navy2",NavyBean.class);
		System.out.println(navy.getRegimentName());
		
		
	}

}
