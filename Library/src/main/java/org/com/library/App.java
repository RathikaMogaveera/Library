package org.com.library;

import org.com.library.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	
	@Autowired
	private UserDao userDao;
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    public void run(String... args) throws Exception{
    	User user=getUser();
    	userDao.createUser(user);
    	
    }
    private User getUser()
    {
    	User user= new User();
    	user.setfName("John122");
    	user.setId(123);
    	user.setlName("Ricky34");
		return user;
    	
    }
}
