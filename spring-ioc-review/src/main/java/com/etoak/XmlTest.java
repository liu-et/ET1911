package com.etoak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.action.UserAction;
import com.etoak.bean.User;

public class XmlTest {

	public static void main(String[] args) {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("spring.xml");
		UserAction UserAction = ioc.getBean(UserAction.class);
		System.out.println(UserAction);
		User user = UserAction.getById(100);
		System.out.println(user);
		System.out.println(user.getId()+ " - " + user.getName());
	}

}
