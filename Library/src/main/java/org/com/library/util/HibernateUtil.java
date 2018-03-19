package org.com.library.util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateUtil {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Bean
	public SessionFactory getSessionFactory(){
		if(entityManagerFactory.unwrap(SessionFactory.class)==null){
			throw new NullPointerException("Factory is not a hibernate factory");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
		
	}
}
