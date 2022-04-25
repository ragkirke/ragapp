package com.incedo.kirke.rag.ragapp;


import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
@Configuration
public class RagappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagappApplication.class, args);
	}
	
	@Bean
	public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource) {
	    return new NamedParameterJdbcTemplate(dataSource);
	}
}
