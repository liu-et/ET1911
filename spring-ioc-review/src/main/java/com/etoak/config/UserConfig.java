package com.etoak.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.action.UserAction;
import com.etoak.service.UserService;

/*
 * 注解@Configuration相当xml根元素的beans标签
 * 表示这是spring ioc容器 
 * 
 * */
@Configuration
public class UserConfig {
	// 使用@BEan注册 spring bean
	// 返回类型相当于 bean 标签的class 属性
	@Bean("userService")
	public UserService userService() {
		return new UserService();
	}

	@Bean
	public UserAction userAction(@Qualifier("userService") UserService userService) {
		UserAction userAction = new UserAction();
		userAction.setUserService(userService);
		return userAction;
	}

}
