package com.app.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.scopes.OwnerBean;

public class TestParlour {
public static void main(String[] args) {
	
	
	String xml="beans.xml";
	ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
	
	ParlourBean parlour=ac.getBean(ParlourBean.class);

	OwnerBean owner=parlour.getOwner();
	
	System.out.println(owner);
	
	System.out.println(parlour);
	
	
	
	
}
}
