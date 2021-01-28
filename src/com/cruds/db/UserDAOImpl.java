package com.cruds.db;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl  implements UserDAO{

	
	private JdbcTemplate jdbctemplate;
	
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	@Override
	public void create(String username, String password, String role) {
		
		String sql="insert into user(username,password,role) values(?,?,?)";
		jdbctemplate.update(sql, new Object[]{username,password,role});
	
	}
	
}
