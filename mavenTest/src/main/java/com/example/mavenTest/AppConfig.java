package com.example.mavenTest;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
		public DataSource dataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUrl("jdbc:mysql://localhost:3306/ldh");
			dataSource.setUsername("ldh");
			dataSource.setPassword("ekgml12#");
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			return dataSource;			
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSorce) {
		return new JdbcTemplate(dataSorce);
	}
}
