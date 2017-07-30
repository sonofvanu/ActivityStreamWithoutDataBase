package com.activity.stream.restservice.config;

import org.springframework.context.annotation.Bean;

import com.activity.stream.restservice.dao.UserDAO;
import com.activity.stream.restservice.daoimpl.UserDAOImpl;

public class BeanDoctor {
	@Bean(name = "userdao")
	public UserDAO createUserDAO() {
		return new UserDAOImpl();
	}
}
