package com.bean.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigfile {
	
	public DriverManagerDataSource myDriverManagerDataSource()
	{
		DriverManagerDataSource data =new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/db21");
		data.setUsername("root");
		data.setPassword("Sakshi@123");
		return data;
	}
		
	
@Bean("jdbc")
	public JdbcTemplate myJdbcTemplete()
	{
		JdbcTemplate temp=new JdbcTemplate();
		temp.setDataSource(myDriverManagerDataSource());
		return temp;
		
	}
}