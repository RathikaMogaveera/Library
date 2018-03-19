package org.com.library;


import java.io.Serializable;

import org.com.library.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory sessionfactry;
	public void createUser(User user)
	{
		Session session=null;
		try
		{
			session=sessionfactry.openSession();
			session.beginTransaction();
			 session.update(user);
			System.out.println("Employee is created with id:");
			session.getTransaction().commit();
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}
