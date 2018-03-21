package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.model.User;
import com.app.service.UserService;

@SpringBootApplication
public class Application {

	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		UserService userService=context.getBean(UserService.class);
		
		User user= new User();
		user.setId(8989);
		user.setfName("Johny");
		user.setlName("joe");
		userService.insertUser(user);
		
	}

}
