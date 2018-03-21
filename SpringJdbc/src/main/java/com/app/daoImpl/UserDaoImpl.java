package com.app.daoImpl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.app.dao.UserDao;
import com.app.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired 
	JdbcTemplate jdbcTemplate;
	
/*	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}*/
	
	@Override
	public void saveUser(User user) {
		
			String sql = "INSERT INTO User " +
					"(id, f_Name,l_name) VALUES (?, ?, ?)" ;
			jdbcTemplate.update(sql, new Object[]{
					user.getId(),user.getfName(), user.getlName()
			});
		
		
	}

}
