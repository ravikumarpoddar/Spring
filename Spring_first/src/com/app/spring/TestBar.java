package com.app.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestBar {
	public static void main(String[] args) {

		// step1 load beans.xml;

		String xml = "C:\\Users\\JSP-SMALLG\\Desktop\\Spring\\Spring_first\\src\\beans.xml";
		// FSR (File System Resource) which loads XML File
		FileSystemResource Fsr = new FileSystemResource(xml);
		// bean Factory Object
		BeanFactory beanFactory = new XmlBeanFactory(Fsr);
		// To Obtain Ref of BearBean
	/*	BarBean bar = beanFactory.getBean(BarBean.class);*/
		
		BarBean bar2 =beanFactory.getBean("bar2",BarBean.class);
		
		// call business method in bar
		System.out.println(bar2.supply());
		System.out.println(bar2.getBarName());

	}
}
